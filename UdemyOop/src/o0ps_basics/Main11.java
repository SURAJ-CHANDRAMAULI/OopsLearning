package o0ps_basics;
class Point2D{
	protected int x;
	protected int y;
	public Point2D() {
	
	}
	public Point2D(int x,int y)
	{
		this.x= x;
		this.y=y;
    }
	public void print() {
		System.out.printf("%d\t%d\n",x,y);
	}
}
//	public int getX() {
//		return x;
//	}
	class Point3D extends Point2D{
		private int z;
		public Point3D() {
		
		}
		public Point3D(int x,int y, int z) {
			super(x,y);
			this.z=z;
		}
		public void print() {
		System.out.printf("%d\t%d\t%d\n",x,y,z);
		}

	}
public class Main11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point2D p1 = new Point2D();
		p1.print();
		Point2D p2 = new Point2D(283,93);
		p2.print();
		Point3D p3 = new Point3D();
		p3.print();
		Point3D p4 = new Point3D(6,67,73);
		p4.print();

	}

}
