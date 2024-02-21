import java.io.*;
class even
{
    public static void main(String args[])throws IOException
    {
        DataInputStream d=new DataInputStream(System.in);
        System.out.print("Enter the Number=");
        int a=Integer.parseInt(d.readLine());
        if(a%2==0)
        {
            System.out.println("The given value is Even");
        }
        else
        {
            System.out.println("The given value is Odd");
        }
    }
}
