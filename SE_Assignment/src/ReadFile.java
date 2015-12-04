import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile extends TextReader{

	public ReadFile(String path) throws FileNotFoundException{
		filepath= path;
		file= new FileReader(filepath);
		reader = new BufferedReader(new FileReader(filepath));
		String line = null;

		try {
			StringBuffer out = new StringBuffer();
			while ((line = reader.readLine()) != null) {
				out.append(line);
				out.append(System.getProperty("line.separator"));
			}
			
			reader.close(); //close the reader
			content= out.toString();

		} catch (IOException ex) {
			System.err.println("File cannot be read");
			ex.printStackTrace();
			content=null;
		}
	}
	
	@Override
	public void display(){
		System.out.println(content);
	}
	
}
