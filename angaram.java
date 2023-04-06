public class main
{
	public static void main(String[] args)
	{
		char[] str1= "angel".toCharArray();
		char[] str2= "gneal".toCharArray();
		
	       //and take one gobal flag
		String flag="anagram";
		
		//we run the first string loop
		for(int i = 0; i < str1.length; i++)	
		{
			//we run thesecond string loop
			for(int j = 0; j < str2.length; j++)	
			{
				//we check the condintion will be true in that palce store #
				if(str1[i] == str2[j])	
				{
					str1[i] = '@';
					str2[j] = '@';
				}
			}
		}
		// checking anagram or not;
		for(int i = 0; i < str1.length; i++) 
		{
			//the str1 is not! to #
			if(str1[i] != '@')	
			{
			   flag = "Not a anagram";
			   break;
			}
		}
		System.out.println(flag);
		
	}

}	
	
	


