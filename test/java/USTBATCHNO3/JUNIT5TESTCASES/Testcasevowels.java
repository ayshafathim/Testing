package USTBATCHNO3.JUNIT5TESTCASES;

	import static org.junit.Assert.assertEquals;
	import org.junit.Test;
	import org.junit.Test;
	
	public class Testcasevowels {
		
		@Test
		public void counttesting() {
			
			String input ="sharath";
			
			int expected=2;
			int actual=Testcasevowels.vowelscount(input);
			assertEquals(expected,actual);
			
		}

		private static int vowelscount(String input) {
			String str = input;
			int len=str.length();
			int i;
			int count=0;
			for(i=0;i<len;i++)
			{
				if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
				{
					count++;
				}
				
			}
			return count;
		
		}
		
		
		

	}

	 

	 

	
