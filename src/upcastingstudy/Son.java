package upcastingstudy;

public class Son extends Father {

	public static void main(String[] args) {
		Son s=new Son();
		s.money();
		s.bike();
		Father f =new Son();
		f.money();
		//f.nature();

	}
	public void money() {
		System.out.println("sons money");
	}
	
	public void bike() {
		System.out.println("sons bike");
	}
	
	public void nature() {
		System.out.println("sons nature");
	}

}
