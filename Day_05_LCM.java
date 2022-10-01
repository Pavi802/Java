//write a java program to find the Lcm of two numbers
import java.io.*;
class lcm
{
    public static void main(String args[])throws IOException
    {
        DataInputStream d= new DataInputStream(System.in);
        System.out.print("Enter the first number=");
        int a=Integer.parseInt(d.readLine());
        System.out.print("Enter the second number=");
        int b=Integer.parseInt(d.readLine());
        int lcm;
        lcm=(a>b)?a:b;
        while(true)
        {
            if(lcm%a==0&&lcm%b==0)
            {
                System.out.println("The LCM of a and b is="+lcm);
                break;
            }
            lcm++;
        }
    }
}
