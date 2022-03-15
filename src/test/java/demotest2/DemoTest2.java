package demotest2;

import org.testng.annotations.Test;

public class DemoTest2 
{
@Test
public void testParameter() {
	
	String BROWSER = System.getProperty("browser");
	String URl = System.getProperty("url");
	
	System.out.println(BROWSER);
	System.out.println(URl);
	
	
}
}
