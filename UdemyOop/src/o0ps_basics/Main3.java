package o0ps_basics;
import java.util.LinkedList;
import java.util.Scanner;
class Shoppingcart{
	private LinkedList list = new LinkedList();
	public void addcart(String product) {
		list.add(product);
	}
	public void order() {
		System.out.println("ordered product : "+list);
	}
}

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Shoppingcart cart1 = new Shoppingcart();
		String p1=s.nextLine();
		String p2=s.nextLine();
		cart1.addcart(p1);
		cart1.addcart(p2);
		cart1.order();

	}

}
