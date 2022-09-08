package seleniumTestNgPrograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class FirstTestNgEx {
  @Test
  public void f()
  {
	  System.out.println("Test Case");
	  
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("After Method");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("After Test");
  }

}
