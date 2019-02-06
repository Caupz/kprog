package caupo;

public class IntEx {
	public static boolean CanParse(String value) {  
		try {  
			Integer.parseInt(value);  
			return true;  
		} catch (NumberFormatException e) {
			return false;  
		}  
	}
	public static int Parse(String value) {  
		int val = 0;
		try {
			val = Integer.parseInt(value);  
		} catch (NumberFormatException e) {
			Console.WriteLine(e.getMessage());
		}
		return val;
	}
}