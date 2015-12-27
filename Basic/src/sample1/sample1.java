package sample1;

public class sample1 {
	static int k=38;
	static void display(){
		System.out.println("Running static method............");
	}
}
class MainClass1{
	public static void main(String[] args) {
		System.out.println("k value is: "+sample1.k);
		sample1.display();
	}
}
