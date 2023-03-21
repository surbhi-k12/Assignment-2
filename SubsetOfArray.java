class SubsetOfArray 
{
    static boolean isSubset(int ar[], int arr[], int p, int q)
    {
        int i = 0;
        int j = 0;
        for (i = 0; i < q; i++) {
            for (j = 0; j < p; j++)
                if (arr[i] == ar[j])
                    break;
            if (j == p)
                return false;
        }
        return true;
    }
    public static void main(String [] args)
    {
        int ar[] = { 3,9,4,8,1,7,2,6};
        int arr[] = { 2,9,1,3};
 
        int p = ar.length;
        int q = arr.length;
        
        System.out.println("checking is Array is subset of another Array");
 
	        if (isSubset(ar, arr, p, q)) 
	        {
	            System.out.print("arr[] is " + "subset of ar[] ");
	        }
	        else 
	        {
	            System.out.print("arr[] is " + "not a subset of ar[]");                        
	        }
    }
}