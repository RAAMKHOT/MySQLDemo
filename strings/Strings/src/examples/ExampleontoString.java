package examples;

public class ExampleontoString {
	int rollno;
	String name;
	String city;
	
	ExampleontoString(int rollno,String name,String city){
		this.rollno=rollno;
		this.name=name;
		this.city=city;
	}
	
	/*public String toString(){
		return name;
	}*/
public static void main(String[] args) {
	ExampleontoString e1=new ExampleontoString(1, "vinod", "mlp");
	ExampleontoString e2=new ExampleontoString(2, "krutika", "rbk");
	
	System.out.println(e1);
	System.out.println(e2);
}
}
