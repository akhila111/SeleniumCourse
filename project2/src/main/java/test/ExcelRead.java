package test;

import java.io.*;

public class ExcelRead {

	public static XSSFWorkbook w;
	public static XSSFSheet s;
	public static FileInputStream f;
	
	public static String readStringData(int i,int j) throws IOException {
		f= new FileInputStream("C:\\Users\\user\\workspace\\project2\\src\\main\\resources\\Student.xlsx");
		w= new XSSFWorkbook(f);
		s= w.getSheet("Sheet1");
		Row r=s.getRow(i);
		Cell c=r.getCell(j);
		
		return c.getStringCellValue();
		
	}
	
    public static String readIntegerData(int i,int j) throws IOException {
    	f= new FileInputStream("C:\\Users\\user\\workspace\\project2\\src\\main\\resources\\Student.xlsx");
		w= new XSSFWorkbook(f);
		s= w.getSheet("Sheet1");
		Row r=s.getRow(i);
		Cell c=r.getCell(j);
		int value=(int) c.getNumericCellValue();
		return String.valueOf(value);
		
		
	}


}
