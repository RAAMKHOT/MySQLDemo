package examples;

public class ObjectEx {

	public static void main(String[] args) {
		Object obj=new Object();
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
		//obj.notify();
		System.out.println(obj.equals("vinod"));
		System.out.println(obj.getClass());

	}

}
