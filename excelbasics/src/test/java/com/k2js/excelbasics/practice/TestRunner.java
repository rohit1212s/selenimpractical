package com.k2js.excelbasics.practice;

import java.util.Arrays;

import org.testng.annotations.Test;

public class TestRunner {

	
	@Test(dataProvider = "abc", dataProviderClass = ExcellReader.class)
	public void verifyConfirmationMessage(String...data) {
		System.out.println(Arrays.deepToString(data));
	}

}
