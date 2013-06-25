package ch.kimhauser.kindle.helloworldv2;

import com.amazon.kindle.kindlet.KindletContext;
import javax.swing.JTextArea;
import com.cowlark.kindlet.KindletWrapper;

public class Main extends KindletWrapper {
	JTextArea kta = null;
	
	@Override
	public void onKindletStart() {
    	KindletContext context = getContext();
		kta = new JTextArea("Hello World V2 example for Kindlet-2.2.jar");
		context.getRootContainer().add(kta);
	}
}
