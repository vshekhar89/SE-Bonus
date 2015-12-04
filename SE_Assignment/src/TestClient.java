import java.io.FileNotFoundException;

public class TestClient {

	public static void main(String args[]) throws FileNotFoundException{
		String filepath ="//Users//shardendu//test.txt";
		TextReader read= new ReadFile(filepath);
		System.out.println("-----------------------Display Contents of File--------------------");
		read.display();
		
		System.out.println("-------------------------Upercase & Encrypt------------------------");
		read = new ToUpperCase(read);
		read= new EncryptFile(read);
		read.display();
		
		System.out.println("-------------------------Encrypt & UpperCase------------------------");
		TextReader EU= new ReadFile(filepath);
		EU= new EncryptFile(EU);
		EU = new ToUpperCase(EU);
		EU.display();
		
		
		System.out.println("-------------------------Encrypt & Display--------------------------");
		TextReader ED= new ReadFile(filepath);
		ED= new EncryptFile(ED);
		ED.display();
		
		
		System.out.println("-------------------------UpperCase & Display-------------------------");
		TextReader UD= new ReadFile(filepath);
		UD = new ToUpperCase(UD);
		UD.display();
	}
}
