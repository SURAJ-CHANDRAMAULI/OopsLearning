package ClassesAndObjects;

public class student 
{
  public String name;
private final int rollnumber;
private static int studentnum;
public student(String name ,int rollnumber) {
	//System.out.println(this);
	this.name = name;
	this.rollnumber=rollnumber;
	studentnum++;
	
}
public static int getstudentnum() {
	return studentnum;
}
public void setroll(int rn)
{
	rn=rollnumber;
}

public int getroll()
{
	return rollnumber;
}
public void print() {
	System.out.println(name+" : "+rollnumber);
}
}
