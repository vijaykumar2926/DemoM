package ParameterPractice;

import org.testng.annotations.Test;

public class ReadTest 
{
	@Test
	public void test()
	{
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		System.out.println("===============");
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println("===============");


	}
}
