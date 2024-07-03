package TEST_annotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations_togather
{

	@Test
	public void test1()
	{
		System.out.println("test case 1");
	}
	@Test
	public void test2()
	{
		System.out.println("test case 2");
	}
	@Test
	public void test3()
	{
		System.out.println("test case 3");
	}
	
@BeforeMethod
public void before()
{
	System.out.println("before method");
}
	
@AfterMethod
public void after()
{
	System.out.println("after method");
}
	
}
