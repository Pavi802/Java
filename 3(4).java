//write a java program to find the leap year

import java.io.*;
class quadratic
{
    public static void main(String args[])throws IOException
    {
        DataInputStream d=new DataInputStream(System.in);
        System.out.print("Enter the year=");
        int year=Integer.parseInt(d.readLine());
        if(((year%4==0)&&(year%100 !=0))||(year%400==0))
        {
            System.out.println("The year is Leap Year");
        }
        else
        {
            System.out.println("The year is not a Leap Year");
        }
    }
}
