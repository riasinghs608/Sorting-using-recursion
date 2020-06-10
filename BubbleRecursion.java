
package recursion;

import java.util.Arrays;


public class BubbleRecursion {
    
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
        
    
    void Bubble(int array[],int i,int n)
    {
       
        for(int j=0;j<array.length-i-1;j++)
        {
            if(array[j]>array[j+1])
            swap(array,j,j+1);   
        }
        
        i++;
        if(i<n)
        {
            Bubble(array,i,n);
        }
        
    }
    
    public static void main(String args[])
    {
         int[] array={20,35,-15,7,55,1,-22};
         
         BubbleRecursion br=new BubbleRecursion();
         br.Bubble(array,0,array.length);
         System.out.println(Arrays.toString(array));
        
    }
    
}
