package OOPSConcept;

public class MethodOverLoading {

	public static void main(String[] args) {
		
		MethodOverLoading obj = new MethodOverLoading();
		obj .sum();
		obj.sum(10);
		obj.sum(25,5);
		
		//MethodOverLoading--->when the method name is same with different arguments or input parametrs within the same class
		//we can overload main method also
		//you can not create a method inside a method
		//duplicate method---i.e same method name with same number of arguments are not allowed
		
	}
	
	public static void main () {
		
	}
	public void sum(double d ) {
		System.out.println("sum method--- 1 input parameter");
	}
    public void sum() {
    	System.out.println("sum method");
     }
    
    public void sum(int i) {
    	System.out.println("sum method --1 input parameter");
    }
	
	public void sum(int h,int g) {
		System.out.println("sum method --2 input parameter");
	}
	

}
