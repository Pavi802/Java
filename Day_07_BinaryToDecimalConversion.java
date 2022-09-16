import java.io.*;
class dtb{
    public static void main(String args[])throws IOException
    {
        DataInputStream d= new DataInputStream(System.in);
        System.out.print("Enter the binary number=");
        long  n=Long.parseLong(d.readLine());
        int decimal=bd(n);
        System.out.print("Enter the number=");
        System.out.print(n+ "=" + decimal);
    }
    public static int bd(long n)
    {
        int deci = 0, i = 0;
        long r;
        while (n!= 0)
        {
           r = n % 10;
           n =n/ 10;
           deci= deci+r*Math.pow(2, i);
            i++;
        }
    return deci;
 }
}
