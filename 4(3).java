//Write a java program to generate the multiplication table

import java.io.*;
class multiplication
{
    public static void main(String args[])throws IOException
    {
        DataInputStream d= new DataInputStream(System.in);
        System.out.print("Enter the number=");
        int n=Integer.parseInt(d.readLine());
        int i;
        for(i=1;i<=10;i++)
        {
            System.out.printf("%d*%d= %d \n",n,i,n*i);
        }
    }
}
