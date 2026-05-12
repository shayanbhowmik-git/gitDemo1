package Bank;

import org.testng.annotations.Test;

public class PersonalLoan {
		
	int income ;
	 @Test 
	 public void eligibility(int income) {
		 if(income>20000) {
			 System.out.println("Eligible");
			 System.out.println("12% interest");
		 }
		 else {
			 System.out.println("Sorry!");
		 }
	 }

	 @Test
	 public void plan() {
		 System.out.println("PersonalLoan");
	 }
}
