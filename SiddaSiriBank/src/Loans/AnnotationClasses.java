package Loans;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AnnotationClasses 
{
	@BeforeSuite
	public void bfs()
	{
		System.out.println("BEFORE SUITE...");
	}
    @BeforeTest
    public void bft()
    {
    	System.out.println("BEFORE TEST...");
    }
    @BeforeClass
    public void bfc()
    {
    	System.out.println("BEFORE CLASS...");
    }
    @BeforeMethod
    public void bfm()
    {
    	System.out.println("BEFORE METHOD...");
    }
    @AfterSuite
    public void afs()
    {
    	System.out.println("AFTER SUITE...");
    }
    @AfterTest
    public void aft()
    {
    	System.out.println("AFTER TEST...");
    }
    @AfterClass
    public void afc()
    {
    	System.out.println("AFTER CLASS...");
    }
    @AfterMethod
    public void afm()
    {
    	System.out.println("AFTER METHOD...");
    }
}
