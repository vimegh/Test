package com.mycompany.app;

import junit.framework.Assert;
import java.lang.annotation.Annotation;

public class MyTest {

	public void testMethod1(){
 		Assert.assertEquals(App.add(2,3), 5);
	}

	public void testMethod2(){
 		Assert.assertEquals(App2.sub(2,3), -1);
	}
}