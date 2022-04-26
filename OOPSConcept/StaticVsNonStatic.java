package OOPSConcept;

public class StaticVsNonStatic {

	String name = "Nani";//non static global var
	static int age =27;//static global var
	
	public static void main(String[] args) {
		
		//how to call static methods and var
		//1.direct calling
		
		sum();
		//2.calling by classname;
		StaticVsNonStatic .sum();
		
		System.out.println(age);
		System.out.println(StaticVsNonStatic.age);
		
		//how to call non static methods and var 
		
		StaticVsNonStatic obj = new StaticVsNonStatic();
		
		obj.sendmail();
		System.out.println(obj.name);
		
		
		
		
		
		
	}

	public void sendmail() {//non  static method
		System.out.println("sendmail method");
	}
	public static void sum() {//static method
		System.out.println("sum method");
	}
	
	
	
}
