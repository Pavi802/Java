import java.io.*;
public class Main
{
  public static void main (String[]args) throws IOException
  {
    DataInputStream d = new DataInputStream (System.in);
    int a[] = new int[20];
    System.out.print ("Enter the array elements=");
    for (int i = 0; i < a.length; i++)
      {
	      a[i] = d.readLine ();
      }
    System.out.print (a[i]);
  }
}
