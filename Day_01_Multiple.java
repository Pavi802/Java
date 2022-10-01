Write a java program to multiply two floating point numbers:-

import java.io.*;
class multiply
{
    public static void main(String args[])throws IOException
    {
    DataInputStream d=new DataInputStream(System.in);
    System.out.print("Enter the First number=");
    float a=Float.parseFloat(d.readLine());
    System.out.print("Enter the second number=");
    float b=Float.parseFloat(d.readLine());
    float c=a*b;
    System.out.println("The Result of a*b is="+c);
    }
}
 
