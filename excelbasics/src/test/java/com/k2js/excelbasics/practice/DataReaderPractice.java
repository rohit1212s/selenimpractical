package com.k2js.excelbasics.practice;

import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataReaderPractice {
	private static Sheet sh;
	static {
		try (FileInputStream fis = new FileInputStream("testdata//NTData.xlsx");
				Workbook wb = WorkbookFactory.create(fis)) {
			sh = wb.getSheetAt(0);
			// sh =wb.getSheet("sheet1");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	//// to get the total row count of a excel sheet
	public static int getRowCount() {
		int rc = sh.getPhysicalNumberOfRows();
		return rc;
	}

	// to get the total cell count of a row in excel sheet
	public static int getRow0cellCount() {
		Row r = sh.getRow(0);
		int cellC = r.getPhysicalNumberOfCells();
		return cellC;

	}

	// to get all row and cell count
	public static int getAllRowCellCount() {
		int rc = sh.getPhysicalNumberOfRows();
		for (int i = 0; i < rc; i++) {
			Row r= sh.getRow(i);
			int cc=r.getPhysicalNumberOfCells();
			System.out.println(cc);

		}
		return rc;
	}

	// to read data from 0th row of 0th cell of the excel sheet
	public static String getRow0Cell0Data() {
		Row r = sh.getRow(0);
		Cell c = r.getCell(0);
		String data = c.getStringCellValue();
		return data;

		// String data=r.getCell(0).getStringCellValue();
	}

	// to read all rows and columns data from a excel sheet
	public static void allRowAllcellData() {
		int rc = sh.getPhysicalNumberOfRows();
		for (int i = 0; i < rc; i++) {
			Row row = sh.getRow(i);
			int cc = row.getPhysicalNumberOfCells();
			for (int c = 0; c < cc; c++) {
				String data = row.getCell(c).getStringCellValue();
				System.out.print(data + "\t");
			}
			System.out.println();
		}
	}

	// Reading test data based on test case name
	public static void getTestCaseData(String TCNAME) {
		int rc = sh.getPhysicalNumberOfRows();
		for (int i = 1; i < rc; i++) {
			Row row = sh.getRow(i);
			String tcn = row.getCell(1).getStringCellValue();
			String tcs = row.getCell(2).getStringCellValue();
			if (tcn.equalsIgnoreCase(TCNAME) && tcs.equalsIgnoreCase("Yes")) {
				for (int c = 3; c < row.getPhysicalNumberOfCells(); c++) {
					String data = row.getCell(c).getStringCellValue();
					System.out.print(data + "\t");
				}
				System.out.println(i);
			}
		}
	}

	// Reading test data based on test case name in 2nd way
	public static void getTestCaseData2(String TCNAME) {
		int i = 0;
		for (Iterator<Row> allrows = sh.iterator(); allrows.hasNext(); i++) {
			Iterator<Cell> allcells = allrows.next().iterator();
			allcells.next();

			String tcn = allcells.next().getStringCellValue();
			String tcs = allcells.next().getStringCellValue();
			if (tcn.equalsIgnoreCase(TCNAME) && tcs.equalsIgnoreCase("Yes")) {
				allcells.forEachRemaining(x -> System.out.print(x + "\t"));

			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
//		int result = DataReaderPractice.getRowCount();
//		System.out.println(result);

		int result2 = DataReaderPractice.getRow0cellCount();
		System.out.println(result2);
		
//		int result3 =DataReaderPractice.getAllRowCellCount();
//		System.out.println(result3);

		// DataReaderPractice.allRowAllcellData();

		// DataReaderPractice.getTestCaseData2("verifyConfirmationMessage");
	}

}
