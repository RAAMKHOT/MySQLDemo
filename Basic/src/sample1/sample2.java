package sample1;

class sample2 {
	static double s=38.5;
	static void test(){
		System.out.println("running test method.......");
	}
}
class sample3{
	static void display(){
		System.out.println("running display........");
		System.out.println("s value is: "+sample2.s);
		sample2.test();
	}
}
class MainClass2{
	public static void main(String[] args) {
		System.out.println("Program started");
		sample3.display();
		System.out.println("Program ended");
	}
}
