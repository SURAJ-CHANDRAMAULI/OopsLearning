package o0ps_basics;
import java.util.Scanner;
class banking{
	private double balance;
	void credit(double Cnewbalance) {
		if(Cnewbalance>0)
		balance+=balance+Cnewbalance;
	}
	void debit(double Dnewbalance) {
		if(Dnewbalance>=0 && Dnewbalance<=balance)
		balance-=Dnewbalance;
	}
	void showbalance() {
		System.out.println(balance);
	}
}
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
banking acc1= new banking();

Scanner s = new Scanner(System.in);
double deposit = s.nextDouble();
acc1.credit(deposit);
double withdraw = s.nextDouble();
acc1.debit(withdraw);
acc1.showbalance();

	}

}
