package OOPSConcept;

public class Functions {

	
	//main method -->starting ponit of execution 
	public static void main(String[] args) {
		
		Functions obj = new Functions ();
		
		obj .sum ();
		int l =obj .pqr ();
        System.out.println(l);
       String s= obj.qa();
        System.out.println(s);
        int d = obj.division(35,5);
		System.out.println(d);
		
		//one object will be creat ,obj is the reference variable refering to this object
		//after creating the object ,the copy of all non static methods will be given to this object
		//main method is void ---never returns a value 
		
		
	}

	//non static methods 
	
	//void does not return any values
	public void sum() {
	System.out.println("sum methods");
	}
	//return type ---int 
	public int pqr () {
		System.out.println("pqr method ");
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
	}
	//return type ---String
	public String qa() {
		System.out.println("qa method");
	     
		String s = "Selenium";
		return s;
	}
	//return type ---int 
	public int division(int k,int l) {
		System.out.println("division method");
		
		int d = k/l;
		return d;
	}
	
	
}
