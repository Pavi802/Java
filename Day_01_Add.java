write a java program to Add two Integers:-

import java.io.*;
class add
{ 
    public static void main(String args[])throws IOException
    {
        DataInputStream d=new DataInputStream(System.in);
        System.out.println("Enter the First number=");
        int a=Integer.parseInt(d.readLine());
        System.out.print("Enter the Second number=");
        int b=Integer.parseInt(d.readLine());
        int c=a+b;
        System.out.println("The Result Number is=" +c);
    }
}
  
