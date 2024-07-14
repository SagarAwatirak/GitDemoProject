package testNGKeyWordProgram;

import org.testng.annotations.Test;

public class ExpectedException {

	@Test(expectedExceptions=ArithmeticException.class)
	public void mymethod()
	{
	 int a=2/0;
	 System.out.println(a);
	}
}
