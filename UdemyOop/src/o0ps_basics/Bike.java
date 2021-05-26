package o0ps_basics;

class motobikes{
   boolean power;
   int speed;
   
   void start() {
	   power = true;
	   speed=0;
   }
    void aclrt(int newspeed) {
	   speed=newspeed;
   }
   void stop() {
	   power=false;
	   speed=0;
	   }
 void printstate() {
	System.out.print("current state:-");
	System.out.print("  power: "+power);
	System.out.println("   speed: "+speed);
 }
}
class Bike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

motobikes b1 = new motobikes();
motobikes b2 = new motobikes();
b1.start();
b2.start();
b1.aclrt(180);
b2.aclrt(60);
b1.printstate();
b2.printstate();

	}

}
