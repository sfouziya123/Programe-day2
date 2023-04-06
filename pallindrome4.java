public class pallindrome
{
	public static void main(String[] args)
	{
		String str = "amma";
		int start = 0;
		int end = str.length()-1;
		String flag = "Pallindrome";
		//run the loop
		while ( start < end )
		{
			//check the condition
			if(str.charAt(start) != str.charAt(end))
			{
				flag = "not palindrome";
				break;
			}
			start++;
			end--;
		}
		//print the output
		System.out.println(flag);	
		
	}
}
