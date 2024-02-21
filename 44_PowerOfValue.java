import java.io.*;
class Main
{
  public static void main(String[] args)throws IOException
  {
    DataInputStream d=new DataInputStream(System.in);
    System.out.print("Enter the base=");
    int b = Integer.parseInt(d.readLine());
    System.out.print("Enter the exponent=");
    int e = Integer.parseInt(d.readLine());

    long result = 1;

    while (e != 0) {
      result *= b;
      e--;
    }

    System.out.println("Answer = " + result);
  }
}
