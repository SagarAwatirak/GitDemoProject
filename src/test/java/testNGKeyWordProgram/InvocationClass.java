package testNGKeyWordProgram;

import org.testng.annotations.Test;

public class InvocationClass {

	@Test(invocationCount=10)
	public void addition()
	{
		int a=5;
		int b=5;
		int c=a+b;
		System.out.println(c=a+b);
	}
}
