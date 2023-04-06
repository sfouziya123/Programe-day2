public class factorial
{
	public static void main(String[] args)
	{
		//it is a factorial number
		int factorial = 1;
		int number = 5;
		//run the loop
		for(int i = 1; i <= number; i++)
		{
			factorial=i*factorial;
		}
		//print the output
		System.out.println(factorial);
	
	}


}
