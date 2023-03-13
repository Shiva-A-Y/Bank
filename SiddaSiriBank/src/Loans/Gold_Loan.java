package Loans;

import org.testng.annotations.Test;

public class Gold_Loan extends AnnotationClasses 
{
	@Test(priority = 1)
	public void GoldEMI()
	{
		System.out.println("You have to Pay...");
	}
	@Test(priority=2)
	public void GoldCollateral()
	{
		System.out.println("Bank Will Pay...");
	}
}
