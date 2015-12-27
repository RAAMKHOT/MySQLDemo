class pen {
	String inkcolor=null;
	pen(String color){
		System.out.println("Creating "+color+" pen instance");
		inkcolor=color;
	}
    void write(){
    	System.out.println("Writing using "+inkcolor+" pen");
    }
}
class MainClass3{
	public static void main(String[] args) {
		pen p=new pen("blue");
		pen p1=new pen("red");
		p.write();
		p.write();
	}
}
