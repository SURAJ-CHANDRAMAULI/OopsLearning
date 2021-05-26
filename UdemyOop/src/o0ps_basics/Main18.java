package o0ps_basics;
//interfaces for loosely coupled code

interface videoplay{
	void play(String fn);
}
class Mp4play implements videoplay{

	@Override
	public void play(String fn) {
		System.out.println("play mp4 in "+fn);
	}
}
class Aviplay implements videoplay{

	@Override
	public void play(String fn) {
		System.out.println("play Avi file "+ fn);
	}
	
}
class playfact{

	public static videoplay getvideo(String fn) {
		if(fn.endsWith(".mp4"))
			return new Mp4play();
		else
			return new Aviplay();
	}

}
public class Main18 {

	public static void main(String[] args) {
String fn = "sample.mp4";
	videoplay vp = playfact.getvideo(fn);
	vp.play(fn);
	}

}
