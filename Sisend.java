package caupo;
import caupo.*;

public class Sisend {
	public static void main(String[] args) {
		Arvutus.cout("Argumente: "+args.length);
		
		for(int i = 0; i < args.length; i++) {
			Arvutus.cout(args[i]);
			Arvutus.cout(args[i].substring(0,1));
		}
	
	}
}