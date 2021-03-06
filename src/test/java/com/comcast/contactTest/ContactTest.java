package com.comcast.contactTest;

import org.testng.annotations.Test;

public class ContactTest {

	@Test(groups = {"Smokesuite","Regressionsuite"})
	public void createContactTest() {
		System.out.println("Execute createContactTest");

		String BROWSER= System.getProperty("browser");
		String ENV =System.getProperty("url");

		
		System.out.println("Browser======>" +BROWSER );
		System.out.println("URL===> "+ ENV);
	}

	@Test(groups = "Regressionsuite")
	public void createContactwithOrgTest() {
		System.out.println("Execute createContactwithOrgTest");
	}

	@Test(groups = "Regressionsuite")
	public void deleteContactTest() {
		System.out.println("Execute deleteContactTest");
	}
	
	@Test(groups = "Regressionsuite")
	public void modifyContactTest() {
		System.out.println("Execute modifyContactTest");
	}

}