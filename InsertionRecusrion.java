
package recursion;

import java.util.Arrays;


public class InsertionRecusrion {
    
    
    void insertion(int array[],int i,int n)
    {
            int key=array[i];
            int j=i-1;
            
            while(j>=0 && array[j]>key)
            {
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=key;
            
            i++;
            if(i<=n)
            {
                insertion(array,i,n);
            }
       
    }
    
    
    public static void main(String args[])
    {
        int arr[]={20,35,-15,7,55,1,-22};
        
        InsertionRecusrion ir=new InsertionRecusrion();
        
        ir.insertion(arr,1,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
