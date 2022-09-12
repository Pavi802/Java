//write a java program to find the gcd of two numbers:

import java.io.*;
class gcd
{
    public static void main(String args[])throws IOException
    {
        DataInputStream d= new DataInputStream(System.in);
        System.out.print("Enter the first number=");
        int a=Integer.parseInt(d.readLine());
        System.out.print("Enter the second number=");
        int b=Integer.parseInt(d.readLine());
        int gcd=1,i;
        for(i=1;i<=a&&i<=b;i++)
        {
            if(a%i==0 && b%i==0)
            {
               gcd=i;
            }
        }
        System.out.println("The Gcd of a and b is=" +gcd);
    }
}
