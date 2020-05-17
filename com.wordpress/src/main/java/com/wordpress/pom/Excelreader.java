package com.wordpress.pom;

public class Excelreader {
	
	
	public static String path="C:\\Users\\Abhi Jani\\Desktop\\Wordpress.xlsx";
	
	public static String sheetname="Sheet1";
	
	public static void main(String[] args) throws Exception {
		
		getdata(path, sheetname);
	}
	
	
	public static void getdata(String path, String sheetname)throws Exception {
		
		
		
		 ExcelUtill utill= new ExcelUtill(path,sheetname);
		 
		 int rows=utill.total_rows();
		 int column=utill.total_col();
		 
		 for(int i=1;i<rows;i++)
		 {
			 for(int j=0;j<column;j++)
			 {
				 System.out.println(utill.celldata(i, j));
			 }
		 }
		
	}

}
