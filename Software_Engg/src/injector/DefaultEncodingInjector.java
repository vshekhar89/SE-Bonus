package injector;

import Interface.EncodingInjectorInterface;
import utilitiy.DefaultEncoder;
import utilitiy.EncodeFile;

public class DefaultEncodingInjector implements EncodingInjectorInterface{

	@Override
	public EncodeFile getEncoder() {
		return new EncodeFile(new DefaultEncoder());
	}

}
