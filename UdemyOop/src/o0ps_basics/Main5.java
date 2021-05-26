package o0ps_basics;
class MyMath{
	
	public static int add(int x , int y) {
		return x+y;
	}
	public static int sub(int x,int y)
	{
		return x-y;
	}
}
	class sample{
		int value;
	public void set(int x,int y) {
		value=y+x;
	}
	public void get() {
		System.out.println(value);
	}
}
public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MyMath.add(65,7)+" "+MyMath.sub(856,78));
		sample obj1 = new sample();
		obj1.set(44,82);
		obj1.get();

	}

}
