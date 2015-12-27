package sample1;

class sample5 {
	static int k=12;
	static void test(){
		sample5.k=38;
	}
}
class sample6{
	static void run(){
		sample5.k=56;
		sample5.test();
	}
}
class MainClass4{
	public static void main(String[] args) {
		System.out.println("Program started");
		System.out.println("k value is: "+sample5.k);
		sample6.run();
		System.out.println("k value is: "+sample5.k);
		System.out.println("Program Ended");
	}
}
