
public class A14 {
	
	
	private void m1() {
		System.out.println("A m1");
		
	}
       void m2() {
    	   System.out.println("A m2");
    	//   m1();
       }
}
   class B14 extends  A14{
	  void m1() {
		 System.out.println("B m1");
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B14 b = new B14();
		b.m1();
		b.m2();
	
		A14 a = new B14();
	//	a.m1();
		a.m2();
	}

}
