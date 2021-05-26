package ClassesAndObjects;

import java.util.Scanner;
public class studentuse {
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	
	student s1 = new student("mauli",40);
	student s2 = new student("shivani",34);
	student s3 = new student("chandra",40);
	System.out.println(s1.getstudentnum());
//	s1.name="Suraj";
//	s1.rollnumber=40;
//   System.out.println(s1);
	//student.studentnum=10;
System.out.println(s2.getstudentnum());
System.out.println(student.getstudentnum());
	
//
s1.print();
s2.print();

}
}