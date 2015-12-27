class sample2 {
	int k=10;
     sample2() {
		System.out.println("running sample2 constructor......");
	}
    void test(){
    	System.out.println("running test............");
    }
}
class Mainclass2{
	public static void main(String[] args) {
		sample2 s=new sample2();
		System.out.println("k value is:"+s.k);
		s.test();
		
	}
}
