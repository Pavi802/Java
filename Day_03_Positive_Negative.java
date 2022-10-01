

import java.io.*;
class pos
{
    public static void main(String args[])throws IOException
    {
        DataInputStream d=new DataInputStream(System.in);
        System.out.print("Enter the number=");
        double n=Double.parseDouble(d.readLine());
        if(n>0.0)
        {
            System.out.println("The number is Positive");
        }
        else if(n<0.0)
        {
            System.out.println("The number is Negative");
        }
        else
        {
            System.out.println("The number is 0");
        }
    }
}
