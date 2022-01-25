package reasdingData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;

public class CsvReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader fr = new FileReader("./testdata/testdata.csv");
		@SuppressWarnings("resource")
		CSVReader csvReader =new CSVReader(fr);
		List<String[]> read = csvReader.readAll();
		String[] linedata = read.get(2);
		System.out.println(linedata);
	}

}
