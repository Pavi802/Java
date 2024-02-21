import java.io.*;
public class Main
{
	public static void main(String[] args)throws IOException
	{
	    DataInputStream d=new DataInputStream(System.in);
		System.out.print("Enter the number=");
		long n=Long.parseLong(d.readLine());
		long second=(n/1000);
		System.out.println("seconds=" +second);
		long minute=(second/60);
		System.out.println("minutes=" +minute);
	}
}
