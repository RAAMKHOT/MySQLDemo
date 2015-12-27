package examples;

public class StringBufferEx {
	public static void main(String[] args) {
		/*StringBuffer sb=new StringBuffer("Hello");
		//System.out.println(sb.ensureCapacity("");
		sb.append("Java");
		System.out.println(sb);
		StringBuffer sb1=new StringBuffer("Hello");
		sb1.insert(1, "Java");
		System.out.println(sb1.capacity());
		System.out.println(sb1);*/
		StringBuffer sb2=new StringBuffer("Hello Java is my favourate subject or language");
		//sb2.delete(0, 2);
		System.out.println(sb2.hashCode());
		System.out.println(sb2.getClass());
		System.out.println(sb2.indexOf("l"));
		System.out.println(sb2);
		System.out.println(sb2.length());
		System.out.println(sb2.lastIndexOf("a"));
		System.out.println(sb2.charAt(8));
		sb2.ensureCapacity(70);
		System.out.println(sb2.capacity());
		
	}

}

