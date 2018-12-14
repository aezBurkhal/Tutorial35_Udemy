package Demo1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Class File, declared variable file, set equal to new file Object
		File file = new File("test.txt");
		
		//Declare file reader Object
		//pass import to instructor
		FileReader fr = new FileReader(file);

	}

}
