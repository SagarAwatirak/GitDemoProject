package testNGExplenation;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestClass {

	@BeforeSuite()
	public void BeforeSuitMethod()
	{
		System.out.println("1...BeforeSuite");
	}
	@BeforeTest
	public void BeforetestMethod()
	{
		System.out.println("2...BeforeTest");
	}
	 @BeforeClass()
	  public void BeforeClassMethod()
	  {
		  System.out.println("3...BeforeClass");
	  }
	@BeforeMethod()
	public void BeforeMethodmethod()
	{
		System.out.println("4...BeforeMethod");
	}
	@Test()
	public void TestMethod1()
	{
		System.out.println("5...TestMethod");
	}
	@Test()
	public void TestMethod2()
	{
		System.out.println("6...TestMethod");
	}
	@Test()
	public void TestMethod3()
	{
		System.out.println("7...TestMethod");
	}
	@AfterMethod()
	public void Aftermethods()
	{
		System.out.println("6...AfterMethod");
	}
	@AfterClass()
	public void Afterclassmethod()
	{
	 System.out.println("7...Afterclass");
	}
	@AfterTest()
	public void AfterMethodss()
	{
		System.out.println("8...AfterTest");
	}
	@AfterSuite()
	public void AftermethodMethod()
	{
		System.out.println("9...AfterSuite");
	}
	
	
	
	
	
	
}
