package o0ps_basics;

interface AudPlay{
	
	void play();
}
interface AudRec{
	void rec();
}
interface AudSys extends AudPlay , AudRec{  //it extend won't implements
	
}
interface FMplay{
	void playfm();
}

abstract class Basemusicsys implements AudSys , FMplay{ //suppose to define all the methods of all implemented interfaces
	
	public void play() {
		System.out.println("play audio  in base music");
	}                                                      //this class is abstract because we didn't defined all the methods of interfaces which are implemented in this class
	public void rec() {
		System.out.println("record audio in base music");
	}
}
interface A {
	
}
interface B{
	
}

class Mymusic extends Basemusicsys implements A,B {
	
	public void playfm() {
		System.out.println("play fm in mymusic");
	}
	public void switchoff() {
		System.out.println("off the music in mymusic");
	}
}



public class Main17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mymusic mym;
		mym = new Mymusic();
		mym.play();
		mym.rec();
		mym.playfm();
		mym.switchoff();
		

		//Mymusic bms = new Basemusicsys(); because Basemusic is abstract class
AudRec ar = mym;
ar.rec();
AudPlay ap =mym;
ap.play();
FMplay fmp = mym;
fmp.playfm();

AudSys as =mym;
as.play();
as.rec();

Basemusicsys bms = mym;
bms.play();
bms.rec();



	}

}
