public class DuplicateArray 
{
	public static void main(String[] args) 
	{
		int arr[]= {38,52,9,18,6,38,13,9,52};
		
		System.out.println("duplicate element present in given array");
		
		for (int i =0;i<arr.length;i++) 
		{
			for (int j=i+1;j<arr.length;j++) 
			{
				if (arr[i]==arr[j]) 
				{
					System.out.println(arr[j]);
				} 
			}
		}
		
	}
}
