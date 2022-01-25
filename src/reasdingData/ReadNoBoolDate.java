package reasdingData;

import java.sql.Date;

import flipkart.ExcelLib;

public class ReadNoBoolDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double testUrl = ExcelLib.readNumberData("Sheet1", 1, 0);
		System.out.println(testUrl);
		boolean username = ExcelLib.readBooleanData("Sheet1", 1, 1);
		System.out.println(username);
		Date password = ExcelLib.readDateData("Sheet1", 1, 2);
		System.out.println(password);
	}

}
