package examples;

public class ExampleontoString2 {
	public static void main(String[] args) {
		String s=new String("vinod");
		System.out.println(s.hashCode());
		System.out.println(s.charAt(1));
		System.out.println(s.toUpperCase());
		System.out.println(s.trim());
		System.out.println(s.endsWith(" "));
		System.out.println(s.indexOf(3));
		System.out.println(s.isEmpty());
		System.out.println(s.substring(1,3));
		System.out.println(s.length());
		System.out.println(s.replace('d', 'D'));
		System.out.println(s.replaceAll("vinod", "krutika"));
		System.out.println(s.lastIndexOf('i'));
		
		
	}
}
