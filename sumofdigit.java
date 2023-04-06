public class sumOfDigit
{
	public static void main(String[] args)
	{
		int num = 124;
		//converted str to integer
		String str = ""+num;
		//print the output
		System.out.println(sumOfDigit(str));
	}
	//Implement the function
	public static int sumOfDigit(String str)
	{
		int sum = 0;
		//run the loop
		for(int i = 0; i < str.length(); i++)
		{
			sum+=str.charAt(i)-'0';
		}
		return sum;
	}
	

}
