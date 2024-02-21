import java.io.*;
public class Main
{
	public static void main(String[] args)throws IOException 
	{
	    DataInputStream d=new DataInputStream(System.in);
	    int[] a={1,2,3,4,5,6};
	    int s=0;
	    int limit1=Integer.parseInt(d.readLine());
	    int limit2=Integer.parseInt(d.readLine());
	    for(int i=limit1;i<=limit2;i++)
	    {
	        s=s+a[i];
	    }
	    System.out.println(""+s);
	     
	}
}




output
3
5
15
