//how to crate brand new xls file


package Testing1;

	import java.io.File;
	import java.io.FileOutputStream;
	import java.io.IOException;

	import org.apache.poi.hssf.usermodel.HSSFWorkbook;

	public class Creatingexcelfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// create a new .xls file with a sheet
				File f = new File("src/test/resources/excelfiles/jaya.xls");// File is a class relates to JDk
				FileOutputStream fo=new FileOutputStream(f);//Fileoutoput is also a class belong to Jdk, Fileoutputstream means is write permission 
				HSSFWorkbook wb=new HSSFWorkbook(); //Horrible spreadsheet format work with xls
				/*HSSFworkbook is a class. its related to POI. If you mousehover on XSSFworkbook it show that it belongs to POI.
				Whenever you create an object to the class, .xlx file will be created */
				
				wb.createSheet();
				wb.write(fo);
				wb.close();
			}

		


	}
