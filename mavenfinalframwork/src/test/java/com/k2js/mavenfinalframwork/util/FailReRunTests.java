package com.k2js.mavenfinalframwork.util;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class FailReRunTests implements IRetryAnalyzer {

	int min_count = 0;
	int max_count = 2;

	@Override
	public boolean retry(ITestResult ir) {
		if(min_count<max_count) {
			min_count++;
			return false;
		}

		return true;
	}

}
