
package recursion;

import java.util.Arrays;


public class SelectionRecursion {
    
   void swap(int[] arr,int i,int j)
    {
        int temp;
        if(i==j)
            return;
        else
        {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
   
   void Selection(int array[],int i,int n)
   {
            int min=i;
            
            for(int j=i+1;j<array.length;j++)
            {
                if(array[min]>array[j])
                    min=j;
            }
            swap(array,min,i);
            
        i++;
        if(i<n)
        {
            Selection(array,i,n);
        }
   }
    
    public static void main(String args[])
    {
         int[] array={20,35,-15,7,55,1,-22};
         
         SelectionRecursion sr=new SelectionRecursion();
         sr.Selection(array, 0, array.length);
         System.out.println(Arrays.toString(array));
    }
    
}
