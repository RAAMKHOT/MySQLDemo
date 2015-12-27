import java.util.Scanner;

class circle {
	double rad;
	final double pi=3.142;
	void diameter(){
		System.out.println("Diameter is: "+(rad*2));
	}
	void area(){
		System.out.println("Area is : "+(pi*rad*rad));
	}
	void cicum(){
		System.out.println("Area is : "+(2*pi*rad));
	}
}
class MainClass1{
	public static void main(String[] args) {
		//Scanner scn=new Scanner(System.in);
		circle c1=new circle();
		c1.rad = 45;
		//System.out.println("Please enter the number");
		c1.diameter();
		c1.area();
		c1.cicum();
	}
}
