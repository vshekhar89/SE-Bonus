
public class ToUpperCase extends TextReaderDecorator{
	
	TextReader readText = null;
	
	public ToUpperCase(TextReader read){
		readText= read;
		setContent(readText.getContent());
		
	}
	
	@Override
	public String getContent(){
		return readText.content;
	}
	
	@Override
	public void setContent(String content){
		if(readText.content !=null){
			readText.content=readText.content.toUpperCase();
		}else{
			readText.content=content.toUpperCase();
		}
	}
	
	@Override
	public void display(){
		System.out.println(getContent());
	}

	
}
