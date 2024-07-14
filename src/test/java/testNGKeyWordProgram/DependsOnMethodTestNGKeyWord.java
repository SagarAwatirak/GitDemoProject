package testNGKeyWordProgram;

import org.testng.annotations.Test;

public class DependsOnMethodTestNGKeyWord {

	@Test
	public void LogInPageTest()
	{
		System.out.println("In Log in Page Test");
		String str="TOM";
		System.out.println(str.charAt(9));
	}
	@Test(dependsOnMethods=" LogInPageTest")
	public void HomePageTest()
	{
		System.out.println("In HomePage Test");
	}
	@Test(dependsOnMethods=" LogInPageTest")
	public void AddToCartTest()
	{
		System.out.println("In AddToCart Test ");
	}
}
