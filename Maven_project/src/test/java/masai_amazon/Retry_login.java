package masai_amazon;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_login implements IRetryAnalyzer
{
   int total_count=1;
   int initial_count=0;
	@Override
	public boolean retry(ITestResult result) 
	{
		if(initial_count!=total_count)
		{
			initial_count++;
		return true;
		}
		return false;
	}

}
