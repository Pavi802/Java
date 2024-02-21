import java.io.*;
public class Main
{
	public static void main(String[] args)throws IOException
	{
	    DataInputStream d=new DataInputStream(System.in);
		System.out.print("Enter the string=");
		String n=d.readLine();
		n = n.replaceAll("\\s", "");
		System.out.print("The string is=" +n);
	}
}
