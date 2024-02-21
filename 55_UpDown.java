import java.util.*;
import java.io.*;
class Main 
{
  public static void main(String[] args)throws IOException
  {
    DataInputStream d=new DataInputStream(System.in);
    int n=Integer.parseInt(d.readLine());
    int a[]=new int[100];
    for (int i=0;i<n;i++)
        a[i]=d.readLine();
    for (int i=0;i<n;i++)
    {
      if(a[i]>7)
         System.out.println("UP");
      else if (a[i]==7)
         System.out.println("EQUAL");
      else
          System.out.println("DOWN");
}
    
  }
}
