package OOPSConcept;

public class LocalVsGlobalVariable {

	//global var = class var
	String name = "satya";
	int age = 27;
	
	public static void main(String[] args) {
		
		int i = 10;//local var for main method
		System.out.println(i);
		LocalVsGlobalVariable obj = new LocalVsGlobalVariable();
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		
	}

	public void test() {//local var for test method
		int i = 20;
		int k = 39;
		
	}
}
