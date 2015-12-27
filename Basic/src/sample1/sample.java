package sample1;

class sample {
	int k=10;
	void display()
	{
		System.out.println("running display method............");
	}
}
class MainClass
{
	public static void main(String[] args) {
		sample s=new sample();
		System.out.println("K value is:"+s.k);
		s.display();
	}
}
