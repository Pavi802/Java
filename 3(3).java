//write a java program to find the largest among three numbers

import java.io.*;
class large
{
    public static void main(String args[])throws IOException
    {
    DataInputStream d=new DataInputStream(System.in);
    System.out.print("Enter the first number=");
    int a=Integer.parseInt(d.readLine());
    System.out.print("Enter the Second number=");
    int b=Integer.parseInt(d.readLine());
    System.out.print("Enter the Third number=");
    int c=Integer.parseInt(d.readLine());
    if((a>b)&&(a>c))
    {
        System.out.println("a is the Largest Number=" +a);
    }
    else if(b>c)
    {
         System.out.println("b is the Largest Number=" +b);
    }
    else
    {
         System.out.println("c is the Largest Number=" +c);
    }
    }
}
