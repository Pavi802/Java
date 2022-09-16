import java.io.*;
class octal 
{
  public static void main(String[] args)throws IOException
  {
      DataInputStream d=new DataInputStream(System.in);
      System.out.print("Enter the number=");
      long binary =Long.parseLong(d.readLine());
      int octal = Bo(binary);
      System.out.println(binary + " in binary = " + octal + " in octal");
  }

  public static int Bo(long binaryNumber) {
    int octalNumber = 0, decimalNumber = 0, i = 0;

    while (binaryNumber != 0) {
      decimalNumber += (binaryNumber % 10) * Math.pow(2, i);
      ++i;
      binaryNumber /= 10;
    }

    i = 1;

    while (decimalNumber != 0) {
      octalNumber= octalNumber+(decimalNumber % 8) * i;
      decimalNumber= decimalNumber/8;
      i=i*10;
    }

    return octalNumber;
  }
}
