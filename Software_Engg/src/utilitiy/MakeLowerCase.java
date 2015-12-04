package utilitiy;

import Interface.ChangeCaseInterface;

public class MakeLowerCase implements ChangeCaseInterface{

	@Override
	public String caseChange(String content) {
		if(content==null){
			return null;
		}
		return content.toLowerCase();
	}

}
