import java.io.*;
public class Main
{

  public static void main(String[] args)throws IOException 
  {
    DataInputStream d=new DataInputStream(System.in);
    System.out.print("Enter the number=");
    int n =Integer.parseInt(d.readLine());
    System.out.print(+ n );

    for (int i = 1; i <= n; ++i) {
      if (n % i == 0) {
        System.out.print(i + " ");
      }
    }
  }
}
