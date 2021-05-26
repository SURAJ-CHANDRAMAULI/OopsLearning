package o0ps_basics;
abstract class Graphic{
	protected int x1,y1;
	protected int x2,y2;
	public void setStart(int x,int y) {
		x1=x;
		y1=y;
	}
	public void setEnd(int x,int y) {
		x2=x;
		y2=y;
	}
	public abstract void Draw(); 
		//System.out.println("no clue");
	
}
class Line extends Graphic{
	@Override
	public void Draw() {
		System.out.printf("draw line from %d,%d  to  %d,%d\n",x1,y1,x2,y2);
	}
}
class Rect extends Graphic{
	@Override
	public void Draw() {
		System.out.printf("draw a rect from %d,%d  to  %d,%d\n",x1,y1,x2,y2);
	}
}
public class Main13 {
	
static void drawutil(int x1, int y1,int x2,int y2, Graphic g) {
	g.setStart(x1, y1);
	g.setEnd(x2,y2);
	g.Draw();
}
	

	public static void main(String[] args) {
		//drawutil(10,10,13,13,new Graphic());
		drawutil(10,10,13,13,new Line());
		drawutil(10,10,13,13,new Rect());
//		// TODO Auto-generated method stub
//Graphic g1 = new Graphic();
//g1.setStart(10,10);
//g1.setEnd(13, 13);
//g1.Draw();
//
//Graphic g2 = new Line();
//g2.setStart(10,10);
//g2.setEnd(13, 13);
//g2.Draw();
//
//Graphic g3 = new Rect();
//g3.setStart(10,10);
//g3.setEnd(13, 13);
//g3.Draw();
	}

}
