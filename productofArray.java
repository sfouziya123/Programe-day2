public class main
{
	public static void main(String[] args)
	{
		int arr[] = {2,3,5,6,4};
		int number = 1;
		
		
		for(int i = 0; i < arr.length; i++ )
		{
			if(arr[i] % 2 == 0)
			{
			number*=arr[i];
			}
		}
		System.out.println(number);
	
	}
	
}
