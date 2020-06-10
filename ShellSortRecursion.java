/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

import java.util.Arrays;

/**
 *
 * @author pc
 */
public class ShellSortRecursion {
    
    
    void shellSort(int arr[],int gap,int n)
    {
        
            for(int i=gap;i<arr.length;i++)
            {
                int ele=arr[i];
                int j=i;
                
                while(j>=gap && arr[j-gap]>ele)
                {
                    arr[j]=arr[j-gap];
                    j=j-gap;
                }
                arr[j]=ele;
            }
            
            gap=gap/2;
            
            if(gap>0)
            {
                shellSort(arr,gap,n);
            }
        
    }
    
    public static void main(String args[])
    {
        ShellSortRecursion ssr=new ShellSortRecursion();
        
        int[] arr={20,35,-15,7,55,1,-22};
        int i=arr.length/2;
        ssr.shellSort(arr,i,arr.length);
        System.out.println(Arrays.toString(arr));
      
    }
    
}
