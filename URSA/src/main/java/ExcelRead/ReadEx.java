package ExcelRead;



import org.apache.poi.xssf.usermodel.XSSFSheet;


public class ReadEx {
private static String filename = null;
private static XSSFSheet sheet = null;
private static String directory = null;



		public static void startIt() {
			ToLaTeX myLua = new ToLaTeX();
			FindAndReplace myFind = new FindAndReplace(myLua);
			ConvertPDF myPDF = new ConvertPDF();
			ShowExcData myExceldata = new ShowExcData(myFind);
			IterateRow myIterator = new IterateRow();
			ReadExcel myReadExcel = new ReadExcel();
			sheet = myReadExcel.readExc(filename);
			      myExceldata.showExelData(myIterator.iterate(sheet), directory);
		}
			        
		 
	    
	    public static void main(String[] path) {
	// An excel file name. You can create a file name with a full
	// path information.
	    	 filename = "C:\\URSA\\ExcelFiles\\Symposium_Abstracts_2018.xlsx";//path[0];
	    	 directory = "C:\\URSA\\LatexFiles";
	         startIt();

	    }
}

