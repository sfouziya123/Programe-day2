public class main
{
	public static void main(String[] args)
	{
		int arr[] = {2,3,4,6,8,1};
		int target = 10;
		System.out.println(targetValue(arr,target));
		
	
	}
	public static String targetValue(int[] arr,int target)
	{
		String flag = "no"+"not equal";
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i+1; j < arr.length; j++ )
			{
				if(arr[i]+arr[j] == target)
				{
					flag = "the target output"+" "+i+","+j+":"+"targetvalue"+" "+target;
					break;
				}
			}
		}
		return flag;
	}
}
