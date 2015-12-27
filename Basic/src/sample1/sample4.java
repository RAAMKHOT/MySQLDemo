package sample1;

class sample4 {
	static int k=12;
	static double d=4.5;
}
class MainClass3{
	public static void main(String[] args) {
		System.out.println("Program started");
		System.out.println("k value is:"+sample4.k);
		System.out.println("d value is:"+sample4.d);
		System.out.println("Modify the value");
		sample4.k=32;
		sample4.d=38.5;
		System.out.println("k value is:"+sample4.k);
		System.out.println("d value is:"+sample4.d);
		System.out.println("Program ended");
	}
}
