class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int count=0;
        int i=0;
        for(i=0;i<arr1.length && count<arr2.length;)
        {
            int j=i;
            while(j<arr1.length)
            {
                if(arr1[j]==arr2[count])
                {
                    int temp=arr1[i];
                    arr1[i++]=arr1[j];
                    arr1[j]=temp;
                }
                j++;
            }
            count++;
        }
        if(i<arr1.length)
        {
            cyclicSort(arr1 , i);
        }

        return arr1;
    }
    public static void cyclicSort(int[] arr1 , int st)
    {
        for(int i=st;i<arr1.length;i++)
        {
            int j=i+1;
            
            while((j>st && j<arr1.length) && arr1[j - 1]>arr1[j])
            {
                int temp=arr1[j];
                arr1[j]=arr1[j-1];
                arr1[j-1]=temp;
                j--;
            }
        }
    }
}