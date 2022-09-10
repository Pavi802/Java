//Write a java program to calculate the sum of Natural Numbers

import java.io.*;
class sum
{
    public static void main(String args[])throws IOException
    {
        DataInputStream d= new DataInputStream(System.in);
        System.out.print("Enter the number=");
        int n=Integer.parseInt(d.readLine());
        int sum=0,i;
        for(i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("The sum of natural number is="+sum);
    }
}
