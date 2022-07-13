
public class MethodsStudy {

	public static void main(String[] args) {
		MethodsStudy ms =new MethodsStudy();
		ms.display();
		ms.tester();
		
MethodSampleClass ms1=new MethodSampleClass();
ms1.sample();
		

	}
	public void display() {
		System.out.println("this is non static display method");
	}
	
	public void tester() {
		System.out.println("this is non static tester method");
	}

}
