
public class EncryptFile extends TextReaderDecorator {

	TextReader readText= null;
	
	public EncryptFile(TextReader read){
		readText= read;
		setContent(readText.getContent());
	}
	
	@Override
	public String getContent(){
		return readText.content;
		
	}
	
	@Override
	public void setContent(String content){
		char[] str = content.toCharArray();
		char[] output= new char[str.length];
		
		for(int i=0;i<str.length;i++){
			if(str[i]==' ' || str[i]=='.')
				output[i]= (char)str[i];
			else
			output[i]= (char)(str[i]+1);
		}
		String out= new String(output);
		readText.content= out;
	}
	
	@Override
	public void display(){
		System.out.println(getContent());
	   
	}
}
