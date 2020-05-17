package com.wordpress.pom;

public class Excelreader {
	
	
	public static String path="C:\\Users\\Abhi Jani\\Desktop\\Wordpress.xlsx";
	
	public static String sheetname="Sheet1";
	
	
	public Object[][] createpost() throws Exception
	{
		Object data[][]=getdata(path, sheetname);
		return data;
		
	}
	public static Object[][] getdata(String path, String sheetname)throws Exception {
		
		
		 ExcelUtill utill= new ExcelUtill(path,sheetname);
		 
		 int rows=utill.total_rows();
		 int column=utill.total_col();
		 
			Object data[][]=new Object[rows-1][column];

		 for(int i=1;i<rows;i++)
		 {
			 for(int j=0;j<column;j++)
			 {
				 //System.out.println(utill.celldata(i, j));
				 
				 String celldata=utill.celldata(rows, column);
				 
				 data[i-1][j]=celldata;
			 }
		 }
		return data;
		
	}

}
