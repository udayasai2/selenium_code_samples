package girmiti.seleniummavenproject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTestNG {
	@Test
	public void add() {
		System.out.println("this is addition method");
	}
	@Test
	public void sub() {
		System.out.println("this is sub method");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("this is before method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("this is after method");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("this is before class");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("this is after class");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("this is beforetest");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("this is aftertest");
	}
}
