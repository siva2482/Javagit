import org.testng.Assert;
import org.testng.annotations.Test;

public class stringmin {
	
	
	public static  String minCat(String s1,String s2)
	{
		String s = null;
		System.out.println(s2.length());
		
		if(s2.length()<s1.length())
		{
			
			int n=s1.length()-s2.length();
			s=s1.substring(n)+s2;
		}
		if(s1.length()<s2.length())
		{
			
			int n=s2.length()-s1.length();
			s=s1+s2.substring(n);
		}
		System.out.println(s);
		return s;
		
	}
	@Test
	public void arun()
	{
		String s1="Hello";
		String s2="Hi";
		String expected="loHi";
		String actual=minCat(s1,s2);
		Assert.assertEquals(expected,actual);
		
	}
	@Test
	public void brun()
	{
		String s1="Java";
		String s2="Hello";
		String expected="Javaello";
		String actual=minCat(s1,s2);
		Assert.assertEquals(expected,actual);
		
	}

	@Test
	public void crun()
	{
		String s1="Hello";
		String s2="Java";
		String expected="elloJava";
		String actual=minCat(s1,s2);
		Assert.assertEquals(expected,actual);
		
	}
	@Test
	public void drun()
	{
		String s1="Hello";
		String s2="";
		String expected="";
		String actual=minCat(s1,s2);
		Assert.assertEquals(expected,actual);
		
	}

}
