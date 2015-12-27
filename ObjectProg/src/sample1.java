class sample1 {
	static double v=38.00;
	int k=57;
	void test()
	{
		System.out.println("running test().........");
	}
}
class MainClass{
	public static void main(String[] args) {
		sample1 s=new sample1();
		System.out.println("k value is:"+s.k);
		System.out.println("v value is:"+sample1.v);
		s.test();
		s.k=100;
		sample1.v=57.00;
		System.out.println("k value is:"+s.k);
		System.out.println("v value is:"+sample1.v);
		
	}
}
