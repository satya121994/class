package OOPSConcept;

public class Car {

	//class var:
	int mod ;
	int wheel ;
	
	 
	public static void main(String[] args) {
		
     //new Car ();---this is the object of car class
		//new keyword is used to create the object
		//a,b,c --->object refernce variable 
		
		Car a = new Car ();
		Car b = new Car ();
		Car c = new Car ();
		
		a.mod = 2015;
		a.wheel = 4;
		
		b.mod = 2019;
		b.wheel = 4;
		
		c.mod = 2014;
		c.wheel = 4;
		
		System.out.println("befor assiging the reference");
		System.out.println(a.mod );
		System.out.println(a.wheel );
		System.out.println(b.mod );
		System.out.println(b.wheel);
		System.out.println(c.mod );
		System.out.println(c.wheel);
		
		  System.out.println("after shifting the reference");
		  
		  a=b;
		  b=c;
		  c=a;
		  
		  a.mod =292;
		  System.out.println(a.mod);
		  
		  b.wheel= 43;
		  System.out.println(b.wheel);
		  
		  c.mod = 39348;
		  System.out.println(c.mod);
		  System.out.println(a.mod);
		
		
		
		
		
		

	}

}
