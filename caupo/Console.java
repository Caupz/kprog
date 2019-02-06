package caupo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {
	public static void main(String[] args) {}
	
	public static void WriteLine(String msg) { System.out.println(msg); }
	public static void Write(String msg) { System.out.print(msg); }
	public static String ReadLine(String msg) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		if(msg.length() > 0) WriteLine(msg);
		String s = "-";
		try {
			s = br.readLine();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return s;
	}
	
}