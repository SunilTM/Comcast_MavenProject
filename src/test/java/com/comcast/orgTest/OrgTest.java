package com.comcast.orgTest;

import org.testng.annotations.Test;

public class OrgTest {

	@Test(groups = "Smokesuite")
	public void createOrgTest() {
		System.out.println("Execute createOrgTest");
		
	}

	@Test(groups = "Regressionsuite")
	public void createOrgwithIndustriesTest() {
		System.out.println("Execute createOrgwithIndustriesTest");
	}

	@Test(groups = "Regressionsuite")
	public void deleteOrgTest() {
		System.out.println("Execute deleteOrgTest");
	}

}