import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



public class Test {

	public static void main(String[] args) throws IOException {
		
		 final String path = "C:\\Users\\struc\\OneDrive\\Desktop\\Streams\\cardealership\\inventory.txt";

		 
		 ArrayList<String> result = new ArrayList<>();
		 
		 try (BufferedReader br = new BufferedReader(new FileReader(path))) {
		     while (br.ready()) {
		         result.add(br.readLine());
		     }
		 }
		 
		 System.out.println(result);
		 
	}
				
		
	}


