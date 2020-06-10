
package recursion;

import java.util.Arrays;


public class CountSortRecusrion {
    
    void countSort(int arr[],int min,int max,int k )
    {
        int[] a=new int[(max-min)+1];
        
        for(int i=0;i<arr.length;i++)
        {
            a[arr[i]-min]++;
        }
        
        int j=0;
        
            while(a[k-min]>0)
            {
                arr[j++]=k;
                a[k-min]--;
            }
       k++;
       if(k<max)
       {
           countSort(arr,min,max,k);
       }
       
    }
    
    
    public static void main(String args[])
    {
        int []arr={20,35,-15,7,55,1,-22};
        CountSortRecusrion cr=new CountSortRecusrion();
        
        cr.countSort(arr,1, arr.length-1, 1);
        System.out.println(Arrays.toString(arr));
        
    }
    
}
