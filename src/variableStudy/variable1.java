package variableStudy;

public class variable1 extends variable2 {
         int a = 300;
         int b = 100;
         static int c = 200;
	public static void main(String[] args) {
		variable1 v =new variable1();
		v.sum();
		
		
	
		System.out.println("value of a is "+v.a);
		System.out.println("value of b is "+v.b);
		System.out.println("value of c "+c);
		
		
		variable2 vk=new variable2();
		System.out.println("value of x "+vk.x);
		System.out.println("value of y "+ variable2.y);
	}
	
	 public void sum()
	 {
		 int a=700;
		 int x=60;
		 int sum=this.a+b;
		System.out.println("sum is "+sum);
		System.out.println("value of x "+super.x);
	 }
}
