package com.comcast.contactTest;

import org.testng.annotations.Test;

public class ContactTest {

	@Test(groups = "Smokesuite")
	public void createContactTest() {
		System.out.println("Execute createContactTest");
	}

	@Test(groups = "Regressionsuite")
	public void createContactwithOrgTest() {
		System.out.println("Execute createContactwithOrgTest");
	}

	@Test(groups = "Regressionsuite")
	public void deleteContactTest() {
		System.out.println("Execute deleteContactTest");
	}

}