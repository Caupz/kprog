package caupo;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class FileEx {
	public static void main(String[] args) {}
	
	public static void Append(String filename, String msg) {
		try(FileWriter fw = new FileWriter(filename, true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter out = new PrintWriter(bw))
		{
			out.println(msg);
		} catch (IOException e) {
			Console.WriteLine(e.getMessage());
		}	
	}
	
}