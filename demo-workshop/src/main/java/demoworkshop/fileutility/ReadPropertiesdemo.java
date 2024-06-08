package demoworkshop.fileutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesdemo {

	FileInputStream fis;
	public String fetchproperty(String key) 
	{
		try {
			//fis=new FileInputStream(".src\test\resources\demoworkshopdetails.properties");
			fis=new FileInputStream(System.getProperty("user.dir")+ "\\src\\main\\resources\\demoworkshopdetails.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties pObj=new Properties();
		try {
			pObj.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String data=pObj.getProperty(key);
		return data;
}
}


