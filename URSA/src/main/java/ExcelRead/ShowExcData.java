package ExcelRead;

import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;

public class ShowExcData{
private static XSSFCell excelvals = null;
/*private static String name = null;
private static String college = null;
private static String majors = null;
private static String Ra = null;
private static String title = null;
private static String abstracts = null;
private static String value = null;*/
public static FindAndReplace myFinder = null;
public ShowExcData(FindAndReplace myFinders) {
	myFinder = myFinders;
}

public void showExelData(List data, String directory) {
	//
	// Iterates the data and prints it out to the console.
	    	//Creates a for loop that will iterate for the number of rows we have in the excel file
	    	for (int i = 0; i < data.size(); i++) {
	    	// Creates a list out of data in each row
	        List list = (List) data.get(i);
	        //Creates a for loop that iterates for the number of values in each row
	        
	        for (int j = 0; j < list.size(); j++) {
	        	//Saves each value from the row into a variable called employee id
	        	System.out.println(j);
	            excelvals = (XSSFCell) list.get(j);
	            System.out.println("We here in show Excel data");
	            //value =excelvals.getRichStringCellValue().getString();
	            //System.out.println(value);
	           if (j==0) {
	            	String name = excelvals.getRichStringCellValue().getString();
	            	myFinder.setAuthor(name);
	            	System.out.println(name);
	            }
	            else if (j==1) {
	            	
	            	String college = excelvals.getRichStringCellValue().getString();
	            	myFinder.setCollege(college);
	            	System.out.println(college);
	            }
	            else if (j==2) {
	            	String majors = excelvals.getRichStringCellValue().getString();
	            	myFinder.setMajor(majors);
	            	System.out.println(majors);
	            }
	            else if (j==3) {
	            	String Ra = excelvals.getRichStringCellValue().getString();
	            	myFinder.setMentor(Ra);
	            	System.out.println(Ra);
	            }
	            else if (j==4) {
	            	String title = excelvals.getRichStringCellValue().getString();
	            	myFinder.setTitle(title);
	            	System.out.println(title);
	            }
	            else if (j==5)  {
	            	String abstracts = excelvals.getRichStringCellValue().getString();
	            	myFinder.setCollege(abstracts);
	            	System.out.println(abstracts);
	            	myFinder.replaceVals(directory);
	            }
	            else {
	            	System.out.println("This should work");
	            }
	           //myVals.closeIt();
	           // storeVars(name, college, majors, Ra, title, abstracts);
	            //System.out.print("Life is Great");
	            //Prints out each value in the row 
	   /* 	}
	    }
}
	        public void storeVars (String names, String colleges, String major, String advisor, String titles, String abstrac) {
	        	myVals.propsWriter(names);
	        	myVals.propsWriter(colleges);
	        	myVals.propsWriter(major);
	        	myVals.propsWriter(advisor);
	        	myVals.propsWriter(titles);
	        	myVals.propsWriter(abstrac);
	        	myVals.closeIt();
	       
} */
	        }
	    	}
	    
}
}

