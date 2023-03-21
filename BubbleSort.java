
public class BubbleSort 
{
	public static void main(String[] args) 
	{
		int []a= {7,5,2,3,1,4,6,9,8,10};
		System.out.println("Bubble Sort");
		System.out.println("Before sorting array");
		for(int elem:a) {
			System.out.print(elem+" ");
		}
		for (int i=0;i<a.length;i++) 
		{
			for (int j=1;j<a.length-i;j++) 
			{
				 if (a[j]<a[j-1]) 
				 {
					 int temp=a[j];
					 a[j]=a[j-1];
					 a[j-1]=temp;
				 }
			}
			
		}
		System.out.println();
		System.out.println("After sorting array");
		for(int flag:a) 
		{
		System.out.print(flag+" ");	
		}
	}

}
