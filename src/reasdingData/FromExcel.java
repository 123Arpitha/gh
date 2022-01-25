package reasdingData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FromExcel {
	public static void main(String[] args) throws InvalidFormatException, IOException {

		FileInputStream fis= new FileInputStream("./testdata/testdata.xls");
		Workbook workbook = WorkbookFactory.create(fis);
		String data = workbook.getSheet("Sheet1").getRow(0).getCell(0).toString();
		System.out.println(data);
	}
}
