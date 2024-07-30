import java.io.*;
public class Main
{
	public static void main(String[] args)throws IOException
	{
	    DataInputStream d=new DataInputStream(System.in);
		System.out.print("Enter the limits=");
		int i;
		int count=0;
		int n=Integer.parseInt(d.readLine());
		 int[] a=new int[30];
		 System.out.print("Enter the array elements=");
		for(i=0;i<n;i++)
		{
		    a[i]=Integer.parseInt(d.readLine());
		}
		System.out.print("Enter the search elements=");
		int k=Integer.parseInt(d.readLine());
		for(i=0;i<n;i++)
		{
		    if(a[i]==k)
		    {
		        //System.out.print("Search element exists");
		        count+=1;
		        break;
		    }
		}
		if(count!=0){
		    System.out.println("Search element exists");
		}
		else
		    {
		        System.out.print("Search element not exists");
		        
		    }
		}
	}
