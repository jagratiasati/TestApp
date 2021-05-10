
public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 75 ,n = 15,ans;
		System.out.println("m:"+m);
		System.out.println("n:"+n);
		while(m!=n) {
			if(m>n)
			{
				m=m-n;
			}
			else {
				n=n-m;
			}
		}
		
		System.out.println("m");
		

	}

}
