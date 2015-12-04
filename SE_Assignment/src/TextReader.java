import java.io.BufferedReader;
import java.io.FileReader;

public class TextReader {
	
	FileReader file = null;
	BufferedReader reader = null;
	String filepath;
	
	public FileReader getFile() {
		return file;
	}

	public void setFile(FileReader file) {
		this.file = file;
	}

	public String getFilepath() {
		return filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	String content;
	
	public void display(){
		
	}

}
