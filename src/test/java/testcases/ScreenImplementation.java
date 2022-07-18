package testcases;

import org.testng.annotations.Test;

public class ScreenImplementation extends ScreenTitle {

	// depending on the screen name , functionality is checking and navigating
	@Test
	public void Screen() throws InterruptedException {
		if (screen_Name.equalsIgnoreCase("Burn-In")) {
			BurnIn.BurnIn_Details();
			BurnIn.InitalAssessment();
			BurnIn.PrintLabel();

		}

		else {
			System.out.println("Page is not yet automated for testing purpose");

		}

	}

}
