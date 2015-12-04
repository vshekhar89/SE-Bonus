package utilitiy;

import Interface.ChangeCaseInterface;

public class MakeUpperCase implements ChangeCaseInterface {

	@Override
	public String caseChange(String content) {
		if(content==null){
			return null;
		}
		return content.toUpperCase();
	}
}
