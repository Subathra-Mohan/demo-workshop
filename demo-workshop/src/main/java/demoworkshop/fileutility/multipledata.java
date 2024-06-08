package demoworkshop.fileutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class multipledata {
	FileInputStream fis = null;
	Workbook wb = null;
	

	public Object[][] exceldata(String sheetname) {
		try {
			fis=new FileInputStream("./src/test/resources/readexceldata.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			wb=WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Sheet sheet=wb.getSheet(sheetname);
		int rowCount=sheet.getPhysicalNumberOfRows();
		int cellCount=sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] data=new Object[rowCount-1][cellCount];
		for(int i=1;i<rowCount;i++)
		{
			for(int j=0;j<cellCount;j++)
			{
				data[i-1][j]=sheet.getRow(i).getCell(j).getStringCellValue();
			}
			
		}
		return data;
		
		
	}

	public static void main(String [] args)
	{
		multipledata excel=new multipledata();
		Object[][] data=excel.exceldata("Sheet1");
				for(int i=0;i<data.length;i++)
				{
					for(int j=0;j<2;j++)
					{
						System.out.println(data[i][j]);
					}
					
				}
				
	}
}
