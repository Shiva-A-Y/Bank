package Loans;

import org.testng.annotations.Test;

public class Car_Loan extends AnnotationClasses 
{
	@Test(priority=2,dependsOnMethods = "OldCar")
	public void NewCar()
	{
		System.out.println("For New Car...");
	}
	@Test(priority = 1,invocationCount = 2)
	public void OldCar()
	{
		System.out.println("For Old Car...");
	}
}
