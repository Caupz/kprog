package caupo;

public class DoubleEx {
	public static void main(String[] args) {}
	public static boolean CanParse(String value) {  
		try {  
			Double.parseDouble(value);  
			return true;  
		} catch (NumberFormatException e) {
			return false;  
		}  
	}
	public static double Parse(String value) {  
		double val = 0;
		try {
			val = Double.parseDouble(value);  
		} catch (NumberFormatException e) {
			Console.WriteLine(e.getMessage());
		}
		return val;
	}
}