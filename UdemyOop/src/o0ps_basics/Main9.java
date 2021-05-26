package o0ps_basics;
class Base{
	public void f()
	{
		System.out.println("f() in base");
	}
	public void g()
	{
	System.out.println("g() in base");
	}
}
class Derrived extends Base
{
	public void f()
	{
		System.out.println("f() in derrived");
	}
	public void h()
	{
		System.out.println("h() in derrived");
	}
	
}
public class Main9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b1 = new Base();
		b1.f();
		b1.g();
		Derrived d1 = new Derrived();
		d1.f();
		d1.g();
		d1.h();

		Base b2 = new Derrived();
		b2.f();
		b2.g();

	}

}
