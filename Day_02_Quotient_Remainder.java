

import java.io.*;
class qr
{
    public static void main(String args[])throws IOException
    {
        DataInputStream d=new DataInputStream(System.in);
        System.out.print("Enter the dividend=");
        int a=Integer.parseInt(d.readLine());
        System.out.print("Enter the divisor=");
        int div=Integer.parseInt(d.readLine());
        int quotient=a/div;
        int remainder=a%div;
        System.out.println("The Quotient is="+quotient);
        System.out.println("The Remainder is="+remainder);
    }
}
