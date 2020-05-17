package com.wordpress.pom;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtill {
	
	public XSSFWorkbook workbook;
	
	public XSSFSheet sheetname;
	
	
	public ExcelUtill(String wb, String sheet) throws Exception
	{
		
		workbook = new XSSFWorkbook(wb);
		
		sheetname=workbook.getSheet(sheet);
		
	}
	
	public int total_rows()
	{
	
		System.out.println("total number of rows are:  " +sheetname.getPhysicalNumberOfRows());
		
		
		return sheetname.getPhysicalNumberOfRows();
	}
	
	public int total_col()
	{
		
		System.out.println("total number of columns are : "+sheetname.getRow(0).getPhysicalNumberOfCells());
		
		return sheetname.getRow(0).getPhysicalNumberOfCells();
	}
	
	
	
	public String celldata(int row,int col)
	{
		
		String cell_value=sheetname.getRow(row).getCell(col).getStringCellValue();
		
		return cell_value;
		
	}

}
