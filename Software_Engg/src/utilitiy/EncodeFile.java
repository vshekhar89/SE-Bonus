package utilitiy;

import Interface.EncodingService;

public class EncodeFile {
	EncodingService service = null;
	
	public EncodeFile(EncodingService scv){
		service= scv;
	}
	
	public String encodeFile(String content){
		return service.encode(content);
	}

}
