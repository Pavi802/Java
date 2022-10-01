//Write a java program to calculate the fabanocci series:

import java.io.*;
class fibanocci
{
    public static void main(String args[])throws IOException
    {
        DataInputStream d=new DataInputStream(System.in);
        System.out.print("Enter the number=");
        int n=Integer.parseInt(d.readLine());
        int a=0,b=1,s=0;
        System.out.print(a);
        System.out.print(b);
        while(s<n-2)
        {
            int c=a+b;
            System.out.print(c);
            a=b;
            b=c;
            s=s+1;
        }
    }
}
