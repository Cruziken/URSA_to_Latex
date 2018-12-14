package ExcelRead;

import de.nixosoft.jlr.*;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ConvertPDF {

	public void makePDF(String path){
			Process p;
			try {
			    p = Runtime.getRuntime().exec("C:\\Users\\Titanium\\AppData\\Local\\Programs\\MiKTeX 2.9\\miktex\\bin\\x64\\lualatex.exe -synctex=1 -interaction=nonstopmode -output-directory C:/URSA/PDFFiles" + " " + path);
			    p.waitFor(1, TimeUnit.SECONDS);
			    //p.waitFor();
			   // p.destroy();
			    System.out.println("We Here");
			} catch (IOException e) {
			    // TODO Auto-generated catch block
			    e.printStackTrace();
			} catch (InterruptedException e) {
			    // TODO Auto-generated catch block
			    e.printStackTrace();
			} 
	}
}