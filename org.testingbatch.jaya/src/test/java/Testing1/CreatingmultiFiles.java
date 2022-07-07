package Testing1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreatingmultiFiles {

	public static void main(String[] args) throws IOException {

		// create a new .xls file with a sheet
		File f = new File("src/test/resources/excelfiles/Vandanacreation.xlsx");// File is a class relates to JDk
		FileOutputStream fo=new FileOutputStream(f);//Fileoutoput is also a class belong to Jdk, Fileoutputstream means is write permission 
		XSSFWorkbook wb=new XSSFWorkbook(); //xml spreadsheet format work with xlsx
		/*XSSFworkbook is a class. its related to POI. If you place mousehover on XSSFworkbook it show that it belongs to POI.
		Whenever you create an object to the class, .xlx file will be created */
		
		wb.createSheet();
		wb.write(fo); // upto previous step, we created the file and the sheet in RAM, now we need to save in harddisk , write 
		wb.close(); // file close
	}

}
	