package caupo;

public class FloatEx {
	public static boolean CanParse(String value) {  
		try {  
			Float.parseFloat(value);  
			return true;  
		} catch (NumberFormatException e) {
			return false;  
		}  
	}
	public static float Parse(String value) {  
		float val = 0;
		try {
			val = Float.parseFloat(value);  
		} catch (NumberFormatException e) {
			Console.WriteLine(e.getMessage());
		}
		return val;
	}
}