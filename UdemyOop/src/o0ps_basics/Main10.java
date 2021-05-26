package o0ps_basics;
class Base{
	public void print()
	{
		System.out.println("hello");
	}
}
class Derived extends Base{
	public void print() {
		System.out.println("derived hello");
	}
}
public class Main10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Base b1 = new Base();
b1.print();
Derived d1 = new Derived();
d1.print();
Base b2 = new Derived();
b2.print();
//Derived d2 = new Base();

	}

}
