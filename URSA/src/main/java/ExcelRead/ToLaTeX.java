package ExcelRead;

import java.io.IOException;

import org.scilab.forge.jlatexmath.*;

public class ToLaTeX {
	
public static void main (String[] args) {
Process p;
try {
    p = Runtime.getRuntime().exec("C:\\pdflatex.map -synctex=1 -interaction=nonstopmode C:\\Users\\b0c\\Documents\\Text.tex");
    p.waitFor();
} catch (IOException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
} catch (InterruptedException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
}
}
