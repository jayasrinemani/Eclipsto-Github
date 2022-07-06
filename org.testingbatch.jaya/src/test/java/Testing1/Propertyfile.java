package Testing1;

import java.io.File;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;


public class Propertyfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f= new File("src\\test\\resources\\jaya.properties\\");
		
		Properties pc=new Properties();
		pc.setProperty("userid","jaya123");
		pc.setProperty("url","http://www.facebook.com");
		
		FileWriter fw=new FileWriter(f);
		pc.store(fw, "Welcome jaya and your configuration details are here");

	}

}
