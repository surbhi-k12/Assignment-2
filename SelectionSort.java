public class SelectionSort 
{
	public static void main(String[] args) 
	{
		int[] arr= {7,5,2,3,1,4,6,9,8,10};
		System.out.println("Selection Sort");
		System.out.println("Before sorting array");
		for(int elem:arr) {
			System.out.print(elem+" ");
		}
		int min;
		int temp=0;
		for(int i=0;i<arr.length;i++) 
		{
			min=i;
			for(int j=i+1;j<arr.length;j++) 
			{ 
				if(arr[j]<arr[min]) 
				{
					min=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		System.out.println();
		System.out.println("After sorting array");
		for(int i=0;i<arr.length;i++) 
		{
			System.out.print(arr[i]+" ");
		}
	}
}
