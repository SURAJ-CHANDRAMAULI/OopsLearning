package o0ps_basics;

class BasicCal{
	public int add(int a,int b)
	{
		return a+b;
	}
	public int sub(int a, int b) 
	{
	    return a-b;	
	}
}
	 class ScCal extends BasicCal{
		 public double sin(double deg) {
			 double rad=deg*(22/7)/180;
			 return Math.sin(rad);
		 }
	}

public class Main8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicCal bc1 = new BasicCal();
		
		ScCal sc1 = new ScCal();
		
		System.out.println(bc1.add(78, 93)+" "+bc1.sub(82,81));
		System.out.println(sc1.add(2,2)+" "+sc1.sub(273,72)+" "+sc1.sin(90));
		 BasicCal bc2 = new ScCal();
		 bc2.add(2735, 26);
		 //bc2.sin(90);

	}

}
