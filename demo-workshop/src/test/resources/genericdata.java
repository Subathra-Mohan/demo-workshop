import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class genericdata {
	FileInputStream fis;
	Workbook wb;
	

	public String exceldata (String sheetname,int row,int cell){
		fis=new FileInputStream("./src/test/resources/readexceldata.xlsx");
		wb=WorkbookFactory(fis);
		sheet=wb.getSheet(sheetname);
		Row row=sheet.getRow(row);
		Cell cell=row.getCell(cell);
		String data=cell.getStringCellValue();
		return data;
		
		
	}

	public void main(String [] args)
	{
		genericdata excel=new genericdata();
		String data=excel.exceldata("Sheet1","row","cell");
				System.out.println(data);
	}

}
