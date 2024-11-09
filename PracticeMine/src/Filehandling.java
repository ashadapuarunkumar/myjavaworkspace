// Import the File class
import java.io.File;

// Import the IOException class to handle errors
import java.io.IOException;
import java.io.Writer;

public class Filehandling {
	public static void main(String[] args)
	{

		try {
			File Obj = new File("myfile.txt");
			  Object myfile;
			Writer writer = new Writer(myfile);
			writer.write("Files in Java are seriously good!!");
		}
		catch (IOException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
		}
	}
}
