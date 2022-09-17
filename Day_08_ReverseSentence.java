import java.io.*;
public class Main
{
	public static void main(String[] args)throws IOException 
	{
	    DataInputStream d = new DataInputStream(System.in);
		System.out.print("Enter the string=");
		String n=d.readLine();
		String r = reverse(n);
        System.out.println("The reverse sentence is: " + r);
	}
	public static String reverse(String n)
	{
	    if (n.isEmpty())
      return n;

    return reverse(n.substring(1)) + n.charAt(0);
	}
}
