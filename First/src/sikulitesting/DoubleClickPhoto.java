package sikulitesting;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class DoubleClickPhoto {

	public static void main(String[] args) throws FindFailed {
		Screen screenobj=new Screen();
		Pattern img=new Pattern("C:\\Users\\SRUTHI\\Desktop\\sikuli images\\clickobj.png.sikuli\\1571652219627.png");
		
		screenobj.doubleClick(img);
	}

}
