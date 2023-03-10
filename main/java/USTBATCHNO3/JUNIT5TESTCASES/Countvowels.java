package USTBATCHNO3.JUNIT5TESTCASES;

public class Countvowels {

	public static void main(String[] args) {
		int count = 0;
		String str="We are going to NEWYORK";
		int length=str.length();
		String str1=str.toLowerCase();
		for(int i=0;i<length;i++)
		{
		if(str1.charAt(i)=='a'|| str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||str1.charAt(i)=='u') {
		  count++;
		}

	}
		System.out.println("Number of vowels is:"+count);
	}

	
	}

