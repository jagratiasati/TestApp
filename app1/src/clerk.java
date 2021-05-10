
public class clerk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc1=new BankAccount();
		
	//	acc1.balance=5000;
	//	System.out.println(acc1.balance);
		
		acc1.setBalance(5000);
		System.out.println(acc1.getBalance());
		
		acc1.setBalance(-5000);
		System.out.println(acc1.getBalance());
	}
}

	

class BankAccount{
	private double balance;
	public void setBalance(double balance) {
	if(balance<=0) {
		System.out.println("dont enter -ve amt");
	}else {
		this.balance=balance;
	}
		
	}
	public double getBalance() {
		return balance;
	}
	}

