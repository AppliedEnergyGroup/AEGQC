package utils;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public String path;
	public FileInputStream fis=null;
	private XSSFWorkbook wb=null;
	private XSSFSheet sheet=null;
	private XSSFRow row=null;
	private XSSFCell cell=null;
	
	//used to set the excel path and retrieve the sheet inside workbook
	public ExcelReader(String path) {
		this.path=path;
		try {
			fis=new FileInputStream(path);
			wb=new XSSFWorkbook(fis);
			sheet=wb.getSheetAt(0);
			fis.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	//get the count of rows in a sheet
	public int getRowCount(String sheetName) {
		int index=wb.getSheetIndex(sheetName);
		int rowCount=0;
		if(index==-1) {
			return 0;
		}else {
			sheet=wb.getSheetAt(index);
			rowCount=sheet.getLastRowNum()+1;
		}
		return rowCount;
	}
	
	public String getCellData(String sheetName,int rowNum,String colName) {
		try {
			//if data not present in any row
			if(rowNum<=0)
				return "";
			
			int index=wb.getSheetIndex(sheetName);
			int col_Num=-1;
			//if sheet doesn't exist in workbook
			if(index==-1)
				return "";
			
			sheet=wb.getSheetAt(index);
			row=sheet.getRow(0);
			for(int i=0;i<row.getLastCellNum();i++) {
				//if col found then set the column number
				if(row.getCell(i).getStringCellValue().trim().equals(colName)) {
					col_Num=i;
					break;
				}
			}
			
			//if column doesn't found in sheet
			if(col_Num==-1)
				return "";
			
			row=sheet.getRow(rowNum-1);
			cell=row.getCell(col_Num);
			
			return cell.getStringCellValue();
			
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
			return "row and column doesn't exist";
		}
	}
}

