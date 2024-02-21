import java.io.*;
public class Main {
  public static void main(String[] args)throws IOException 
  {
    DataInputStream d=new DataInputStream(System.in);
    System.out.print("Enter the base=");
    int b = Integer.parseInt(d.readLine());
    System.out.print("Enter the power=");
    int p = Integer.parseInt(d.readLine());
    int result = power(b, p);
    System.out.println(b + "^" + p + "=" + result);
  }

  public static int power(int b, int p) {
    if (p != 0)
    {
      return (b * power(b, p - 1));
    }
    else {
      return 1;
    }
  }
}
