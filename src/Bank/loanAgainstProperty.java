package Bank;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class loanAgainstProperty  {
	@Parameters({"Name"})
	@Test()
	public void eligibilty(String value) {
		System.out.println(value);
		System.out.println("Land dont Have any dispute");
		Assert.assertFalse(true);
		
	}
	 @Test(dependsOnMethods="eligibilty")
	 public void plan() {
		 System.out.println("LAP LOAN");
		 plan();
	 }
}
