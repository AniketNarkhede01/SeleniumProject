package testNGAnnotation;

import org.junit.AfterClass;
import org.junit.Before;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationTest {
	@Test
	public void f()
	{
		
		System.out.println("Test Method");
	}
	@BeforeMethod
	public void beforeMethod() 
	{
		
	}
	@AfterMethod
	public void afterMethod() 
	{
		
	}
	@BeforeClass
    public void beforeClass() 
    {
    	
    }
    @AfterClass
    public void afterClass() 
    {
    	
    }
}
