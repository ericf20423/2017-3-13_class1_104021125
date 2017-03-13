
public class Classtest {
	public static void main(String argc[]){		
		System.out.println("建立了:"+Shape.count()+"個物件");
		Shape circle1 = new Shape(4);
		System.out.println("邊長:"+circle1.countAns()[0]+"\n"+"面積"+circle1.countAns()[1]);
		System.out.println("建立了:"+circle1.count()+"個物件");
		Shape rectangle = new Shape(4,3);
		System.out.println("邊長:"+rectangle.countAns()[0]+"\n"+"面積"+rectangle.countAns()[1]);
		System.out.println("建立了:"+Shape.count()+"個物件");
		Shape triangle = new Shape(4,3,60);
		System.out.println("邊長:"+triangle.countAns()[0]+"\n"+"面積"+triangle.countAns()[1]);
		System.out.println("建立了:"+triangle.count()+"個物件");

	}

}

class Shape{
	private int r,w,h,a,b,type;
	private double o;
	private static int cont;
	public Shape(int r1){
		r = r1;
		type = 1;
		cont++;
	}
	public Shape(int w1,int h1){
		w = w1;
		h = h1;
		type = 2;
		cont++;
	}
	public Shape(int a1,int b1,int o1){
		a = a1;
		b = b1;
		o = o1;
		type = 3;
		cont++;
	}
	public double[] countAns(){
		double area = 0;
		double l = 0;
		double[] ans = new double[2]; 
		switch(type){ 
			case 1:
				l = 2*r*Math.PI; 
				area = (float)(r*r*Math.PI);
				ans[0] = l;ans[1] = area;
				break; 
			case 2:
				l = 2*(w+h);
				area = w*h;
				ans[0] = l;ans[1] = area;
				break;
			case 3:
				l = Math.sqrt(Math.pow(a,2)+Math.pow(b,2)+2*a*b*Math.cos(Math.toRadians(o)))+a+b;
				area = Math.sin(Math.toRadians(o))*a*b/2;
				ans[0] = l;ans[1] = area;
				break;
		}
		return ans;
	}
	public static int count(){
		return cont;
	}
	
}