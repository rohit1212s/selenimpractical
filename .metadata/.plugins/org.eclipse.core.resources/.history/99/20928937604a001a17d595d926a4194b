package com.k2js.excelbasics.practice;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ExcellReader {
	static Sheet sh;
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

	@DataProvider(name="abc")
	public static String[][] stroreTestData(Method tcName) {
		String tcn = tcName.getName();
		List<String[]> alldata = new ArrayList<String[]>();
		int rc = sh.getPhysicalNumberOfRows();
		for (int r = 1; r < rc; r++) {
			Row row = sh.getRow(r);
			String tname = row.getCell(1).getStringCellValue();
			String tstatus = row.getCell(2).getStringCellValue();
			if (tname.equalsIgnoreCase(tcn) && tstatus.equalsIgnoreCase("Yes")) {
				List<String> eachcellDataList = new ArrayList<String>();
				//System.out.println(row.getPhysicalNumberOfCells());
				for (int c = 3; c < row.getPhysicalNumberOfCells(); c++) {
					eachcellDataList.add(row.getCell(c).getStringCellValue());
				}
				eachcellDataList.add(r + "");
				alldata.add(eachcellDataList.toArray(new String[0]));
			}
		}

		return alldata.toArray(new String[0][0]);

	}

//	public static void main(String[] args) {
//		System.out.println(Arrays.deepToString(stroreTestData("verifyConfirmationMessage")));
//	}

}
