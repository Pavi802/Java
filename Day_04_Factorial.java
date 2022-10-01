//Write a java program to find the factorial of  a given number

import java.io.*;
class factorial
{
    public static void main(Strin args[])throws IOException
    {
        DataInputStream d=new DataInputStream(System.in);
        System.out.print("Enter the number=");
        int n=Integer.parseInt(d.readLine());
        int fact=1,i;
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("The factorial number is="+fact);
    }
}
