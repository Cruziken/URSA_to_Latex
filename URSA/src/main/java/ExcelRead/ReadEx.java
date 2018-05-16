package ExcelRead;



import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class ReadEx {
private static String filename = null;
private static XSSFSheet sheet = null;



		public static void startIt() throws IOException {
			ValuesWriter myValues = new ValuesWriter("Excel","C://Users//b0c//Downloads"); 
			ShowExcData myExceldata = new ShowExcData(myValues);
			IterateRow myIterator = new IterateRow();
			// Create an ArrayList to store the data read from excel sheet.
			        List sheetData = new ArrayList();

			        FileInputStream fis = null;
			// Create a FileInputStream that will be use to read the
			// excel file.
			            try {
							fis = new FileInputStream(filename);
			// Create an excel workbook from the file system.
			            XSSFWorkbook workbook = new XSSFWorkbook(fis);
			// Get the first sheet on the workbook.
			             sheet = workbook.getSheetAt(0);
		 } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
			     System.out.println("Hello World");
			      myExceldata.showExelData(myIterator.iterate(sheet));
		}
			        
		
	    
	    public static void main(String[] path) throws Exception {
	// An excel file name. You can create a file name with a full
	// path information.
	    	 filename = path[0];
	         startIt();

	    }
}

