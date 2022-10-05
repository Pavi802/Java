import java.util.*;
import java.io.*;
class Main 
{
  public static void main(String[] args)throws IOException 
  {
    DataInputStream d=new DataInputStream(System.in);
    int m=Integer.parseInt(d.readLine());
    int n=Integer.parseInt(d.readLine());
    if (m%n==0)
    System.out.println("YES");
    else 
     System.out.println("NO");
  }
}
