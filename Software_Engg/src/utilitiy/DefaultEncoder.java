package utilitiy;

import Interface.EncodingService;

public class DefaultEncoder implements EncodingService {

	@Override
	public String encode(String content){
		char[] str = content.toCharArray();
		char[] output= new char[str.length];
		
		for(int i=0;i<str.length;i++){
			if(str[i]==' ' || str[i]=='.')
				output[i]= (char)str[i];
			else
			output[i]= (char)(str[i]+1);
		}
	    return new String(output);
	}
}
