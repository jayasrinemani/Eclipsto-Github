//how to crate brand new xls file


package Testing1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

	public class Addingtwovalues {

	public static void main(String[] args) throws IOException {
		File f1 = new File("src/test/resources/excelfiles/jaya6.xlsx");// Here the path of the excel file
		FileInputStream fi= new FileInputStream(f1); //wherever inputstream means read mode, i took read permission
		

		// Load that permitted file into RAM as an excel
		Workbook web=WorkbookFactory.create(fi);// excel called as workbook. in poiooxml, workbook is a call. 
		//load into RAM as an excel, i took write permission
		
		Sheet sh = web.getSheet("Sheet1");
		// Get used rows cout
		int nour = sh.getPhysicalNumberOfRows(); // nour = number of used row coloumns, here for exapke 5 where data there
		// 1s row (index=0) has names of coloumns

		for(int i=1; i<nour; i++)  // we are not bothering on i=0 which is index[0]
		{
		DataFormatter dt=new DataFormatter();// get any type of data from cells as String to
		Cell c1=sh.getRow(i).getCell(0);// first coloiumn 200
		Cell c2=sh.getRow(i).getCell(1);// second coloumn 50
		int x=Integer.parseInt(dt.formatCellValue(c1));
		int y=Integer.parseInt(dt.formatCellValue(c2));
		int z=x+y; //addition
		Cell c3=sh.getRow(i).createCell(2); // 3rd coloumn
		c3.setCellValue(z); //paste the value of x+y
		}
		// save excel file
		FileOutputStream fo=new FileOutputStream(f1);//write  mode, i took write permision from jayasri
		web.write(fo); // file from RAM to hard disk
		web.close();
		}
		}


/*indiex[1] = 78
index[2]=89
index[3]=45
index[4]=23

Getcell[0]= 78
Getcell[1]=34
Createcell[2] = x+y
Setcell will place the value in cell
  */
