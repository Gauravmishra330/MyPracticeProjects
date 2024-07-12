package prime;

public class MethodExample {
	
	public void print() {
		
		System.out.println("print method withod parameters.");
	}
	
	public void print(String name) {
		
		
		System.out.println("Print method with parameter");
	}

	public static void main(String[] args) {
		
		
		MethodExample obj1=new MethodExample();
		
		obj1.print();
		
		obj1.print("xx");
		
	}

}
