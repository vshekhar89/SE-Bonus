package utilitiy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;
import java.io.FileInputStream;

public class ReadFile {
	
	FileReader file = null;
	BufferedReader reader = null;
	
	//Using composition as FileReader and BufferedReader for this file is
	//specific to this instance of ReadFile
	public ReadFile(String filepath) {
		try{
			file= new FileReader(filepath);
			reader = new BufferedReader(new FileReader(filepath));
		}catch (FileNotFoundException ex) {
			System.err.println("File "+ filepath +" not found");
			ex.printStackTrace();
		} 	
	}

	public String readFile() {
		
		// This will reference one line at a time
		String line = null;

		try {
			StringBuffer out = new StringBuffer();
			while ((line = reader.readLine()) != null) {
				out.append(line);
				out.append(System.getProperty("line.separator"));
			}
			
			reader.close(); //close the reader
			return out.toString();

		} catch (IOException ex) {
			System.err.println("File cannot be read");
			ex.printStackTrace();
			return null;
		}
	}
}
