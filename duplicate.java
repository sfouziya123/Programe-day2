public class main 
{
	public static void main(String[] args)
	{
		int arr[] = {2,2,1,1,4,4,5,6,7,7 };
		
		System.out.println(duplicate(arr));
		
	}
	public static int duplicate(int[] arr)	
	{
		int count = 0;
		
		for(int i=0; i< arr.length-1; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
				count+=1;
				break;
				}
			}
		}
		return count;
		
	}

}
