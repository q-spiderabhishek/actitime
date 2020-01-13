package com.actitime.test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.actitime.generics.ListenersCls.class)

public class Demo {

	@Test
	public void testDemo() {
		Reporter.log("failing",true);
		Assert.fail();
	}

}
