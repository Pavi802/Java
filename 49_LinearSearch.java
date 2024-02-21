import java.io.*;
public class Main
{
	public static void main(String[] args)throws IOException
	{
	    DataInputStream d=new DataInputStream(System.in);
		System.out.print("Enter the limits=");
		int i;
		int n=Integer.parseInt(d.readLine());
		 int[] a=new int[30];
		 System.out.print("Enter the array elements=")
		for(i=0;i<=n;i++)
		{
		    a[i]=Integer.parseInt(d.readLine());
		}
		System.out.print("Enter the search elements=");
		int k=Integer.parseInt(d.readLine());
		for(int j=0;j<n;j++)
		{
		    if(a[i]==k)
		    {
		        System.out.print("Search element exists");
		        break;
		    }
		    else
		    {
		        System.out.print("Search element not exists");
		        break;
		    }
		}
	}
}
