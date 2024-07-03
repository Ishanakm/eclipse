package assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Skip_testcase
{
@Test
public void login()
{
	Assert.assertTrue(false);
}
@Test(dependsOnMethods="login")
public void logout()
{
	
}
}
