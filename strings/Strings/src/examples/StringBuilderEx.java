package examples;

public class StringBuilderEx {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder(10);
		sb.append("Vinod S");
		System.out.println(sb.reverse());
		int sb1=sb.capacity();
		int sb2=sb.length();
		System.out.println(sb2);

		System.out.println(sb1);
		
	}

}
