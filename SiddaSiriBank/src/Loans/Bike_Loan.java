package Loans;

import org.testng.annotations.Test;

public class Bike_Loan extends AnnotationClasses 
{
@Test
public void Secured()
{
	System.out.println("With Insurance...");
}
@Test
public void Unsecured()
{
	System.out.println("Without Insurance...");
}

}