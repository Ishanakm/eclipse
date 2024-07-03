package assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_methods 
{
@Test
public void assertion()
{
	boolean a= 3>4;
	Assert.assertTrue(true);//(boolean condition)
	Assert.assertTrue(true,"not true");//(boolean condition, String message)
	Assert.assertFalse(false);//(boolean condition)
	Assert.assertFalse(false, "true");//(boolean condition, String message)
	Assert.assertEquals(false, false);//(boolean actual, boolean expected)
	Assert.assertEquals(true, true, "correct");  //(boolean actual, boolean expected, String message)
	Assert.assertEquals(3, 5);    //(int actual, int expected)
	Assert.assertEquals(6, 0, ""); //(int actual, int expected, String message)
	Assert.assertEquals('f', 'r', "");//(char actual, char expected, String message)
	Assert.assertEquals('d', 'g');//(char actual, char expected)
	Assert.assertEquals(34, 3);//(int actual, int expected)
    Assert.assertEquals(435435, 0);//(int actual, int expected)
    Assert.assertEquals(0, 0, "");//(int actual, int expected, String message)
    Assert.assertEquals(0, 0);
    
}
}
