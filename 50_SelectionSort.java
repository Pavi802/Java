import java.io.*;
public class Main{
    public static void main(String args[])throws IOException
    {
        DataInputStream d=new DataInputStream(System.in);
        int i,j,temp;
        int arr[]=new int[20];
        System.out.print("Enter the limits=");
        int size=Integer.parseInt(d.readLine());
        System.out.print("Enter the array elements=");
        for(i=0;i<size;i++)
        {
            arr[i]=Integer.parseInt(d.readLine());
        }
        for(i=0;i<size;i++)
        {
            for(j=i+1;j<size;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
         for(i=0;i<size;i++)
         {
             System.out.print(arr[i]+"");
         }
        
    }
}
