package o0ps_basics;
//methods 
interface Calc{
	double pi = 3.14159;//public static final
	//Calc.pi;
	
double add(double a, double b);
double sub(double a, double b);

}

class Mycalc implements Calc{
	@Override
	public double add(double a, double b) {
		return a+b;
	}
	@Override
	public double sub(double a, double b) {
		return a-b;
	}
	public static double sin(double deg) {  //not static
		double rad=deg*22/7;
		return Math.sin(rad);   
	}
	
}
public class Main16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mycalc obj = new Mycalc();
		System.out.println(obj.add(6, 3));
		System.out.println(obj.sub(6, 3));
		//System.out.println(obj.sin(90));
		System.out.println(obj.add(6, 3));
		System.out.println(obj.sub(6, 3));
		System.out.println(Mycalc.sin(90));//hence sin is static it can be directly refered by class name.
		
		
		Calc c;
		c= new Mycalc();
		System.out.println(c.add(6, 3));
		System.out.println(c.sub(6, 3));
//System.out.println(c.sin(90));   because c is type of Calc and sin is not memeber of Calc
		

	}

}
