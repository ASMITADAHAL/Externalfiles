package externalData;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RWexcel {

	public static void Main(String[] args) throws IOException {
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet ws=wb.createSheet("StudentAttendance");
		
		Row row0=ws.createRow(0);
        Row row1=ws.createRow(1);
	    Row row2=ws.createRow(2);
	    
	    
	    Cell cellA=row0.createCell(0);
	    cellA.setCellValue("James");
	    File f = new File("c:\\ABC\\J\\myExcell");
	    FileOutputStream fo =new FileOutputStream(f);
	    wb.write(fo);
	    fo.close();
	}

	
	}


