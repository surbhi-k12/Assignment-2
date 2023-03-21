public class QuickSort  
{   
int sorting (int a[], int start, int end)  
{  
    int pivot = a[end]; 
    int i = (start - 1);  
    for (int j = start; j <= end - 1; j++)  
    {  
        if (a[j] < pivot)  
        {  
            i++; 
            int t = a[i];  
            a[i] = a[j];  
            a[j] = t;  
        }  
    }  
    int t = a[i+1];  
    a[i+1] = a[end];  
    a[end] = t;  
    return (i + 1);  
}  
void quick(int a[], int start, int end)  
{  
    if (start < end)  
    {  
        int p = sorting(a, start, end);  
        quick(a, start, p - 1);  
        quick(a, p + 1, end);  
    }  
}  
void printArr(int a[], int count)  
{  
    int i;  
    for (i = 0; i < count; i++)  
        System.out.print(a[i] + " ");  
}  
    public static void main(String[] args) 
    {  
    	System.out.println("Quick Sort");
	    int a[] = {7,3,2,4,6,9,5,10,1,8};  
	    int size = a.length;  
		    System.out.println("Before sorting array");  
		    QuickSort q1 = new QuickSort();  
		    q1.printArr(a, size);  
		    q1.quick(a, 0, size - 1);  
		    
		    System.out.println();
		    System.out.println("After sorting array");  
		    q1.printArr(a, size);  
		    System.out.println();  
    }  
}  