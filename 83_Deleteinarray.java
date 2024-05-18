import java.util.*;

public class ArrayOperation {
    public static void deletion(int a[],int n,int in)
    {
        for(int i=in;i<n-1;i++)
        {
            a[i]=a[i+1];
            
        }
        n--;
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+a[i]);
        }
        
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int arr[]=new int[20];
        System.out.print("Enter the no of elements:");
        int n=s.nextInt();
        System.out.print("\nEnter the elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
            System.out.print("Enter the deletion index");
                   int din=s.nextInt();
                   deletion(arr,n,din);
    }
}
