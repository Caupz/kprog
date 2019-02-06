package caupo;

public class Arvutus{
	public static void main(String[] args) {
		int vanus = 8;
		
		if(args.length==1 && tryParseInt(args[0])) {
			vanus = Integer.parseInt(args[0]);
		} else {
			cout("Viga parsimisel");
		}
		
		if(vanus < 18) cout("Lapsepilet");
		else if(vanus < 7) cout("Tasuta");
		else cout("Täispilet");
		
		for(int i = 0; i < vanus; i++) {
			cout("Õnne!");
		}
	}
	
	public static void cout(String msg) {
		System.out.println(msg);
	}
	
	public static boolean tryParseInt(String value) {  
		try {  
			Integer.parseInt(value);  
			return true;  
		} catch (NumberFormatException e) {
			return false;  
		}  
	}
}