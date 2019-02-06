package caupo;

public class Sisend {
	
	public static void main(String[] args) {
		Arvutus.cout("Argumente: "+args.length);
		int summa = 0;
		for(int i = 0; i < args.length; i++) {
			Arvutus.cout(args[i]);
			Arvutus.cout(args[i].substring(0,1));
			summa += args[i].length();
		}
		
		Arvutus.cout("Summa: "+summa);
		
		String s = Console.ReadLine("Sisesta sisend: ");
		Console.WriteLine("SISEND OLI: "+s);
	}
}