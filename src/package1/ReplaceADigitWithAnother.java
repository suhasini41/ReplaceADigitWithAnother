package package1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReplaceADigitWithAnother 
{

	private static int replaceDigits(int n) {
		String s = Integer.toString(n);
	    char[] ch = s.toCharArray();
	    for(int i=0;i<ch.length;i++)
	    {
	        switch(ch[i])
	        {
	            case '0':
	            {
	                ch[i] = '9';
	                break;
	            }
	            case '1':
	            {
	            	 ch[i] = '8';
	                break;
	            }
	            case '2':
	            {
	            	 ch[i] = '7';
	                break;
	            }
	            case '3':
	            {
	            	 ch[i] = '6';
	                break;
	            }
	            case '4':
	            {
	            	 ch[i] = '5';
	                break;
	            }
	            case '5':
	            {
	            	 ch[i] = '4';
	                break;
	            }
	            case '6':
	            {
	            	ch[i] = '3';
	                break;
	            }
	            case '7':
	            {
	            	 ch[i] = '2';
	                break;
	            }
	            case '8':
	            {
	            	 ch[i] = '1';
	                break;
	            }
	            case '9':
	            {
	            	 ch[i] = '0';
	                break;
	            }
	        }
	    }
	    String s1 = String.valueOf(ch);
	    int answer = Integer.parseInt(s1);
		return answer;
	}
	
	@Test
	public void testCase1()
	{
		Assert.assertEquals(replaceDigits(9364), 635);
	}
	
	@Test
	public void testCase2()
	{
		Assert.assertEquals(replaceDigits(9999),0);
	}

	
}
