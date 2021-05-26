package o0ps_basics;
abstract class Base{
	 
	 public abstract  void f();
		 public abstract void g();
		 public void h(){
			 System.out.println("h in base");
			 
		 }
	 
	
}
abstract class Derived extends Base{
	@Override
	public void f() {
		System.out.println("f is in derived");
	}
//	@Override
//		public void g(){
//			System.out.println("g in derived");
//		}
}
class Derived1 extends Derived{
	@Override
	public void g(){
		System.out.println("g in derived1");
	}
	
}

public class Main15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Base b;
//b=new base();
Derived d;
//d=new derived();
Derived1 d1;
b= new Derived1();
d=new Derived1();
d1= new Derived1();
b.f();
b.g();
b.h();

d.f();
d.g();
d.h();

d1.f();
d1.g();
d1.h();
	}

}
