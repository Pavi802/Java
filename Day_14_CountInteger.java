import java.io.*;
public class Main 
{

  public static void main(String[] args)throws IOException 
  {
    DataInputStream d=new DataInputStream(System.in);
    int count = 0;
    System.out.print("Enter the number=");
    int n=Integer.parseInt(d.readLine());

    while (n != 0) {
      n =n/ 10;
      count++;
    }

    System.out.println("Total: " + count);
  }
}
