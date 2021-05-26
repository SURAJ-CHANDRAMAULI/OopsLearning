package o0ps_basics;
class complex{
	private double real,imag;
	public complex(){
		real=imag=0;
		}
	public complex(double x) {
		real=x;
		imag=0;
	}
	public complex(double x, double y) {
		real=x;
		imag=y;
	}
public void print() {
	System.out.println(real+" + i"+imag);
}
	
}
public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
complex c1 = new complex();
complex c2 = new complex(6);
complex c3 = new complex(6,9);
c1.print();
c2.print();
c3.print();
}

}
