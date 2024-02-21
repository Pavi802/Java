//armstrong number
import java.io.*;
class armstrong{
    public static void main(String args[])throws IOException
    {
        DataInputStream d= new DataInputStream(System.in);
        System.out.print("Enter the number=");
        int n=Integer.parseInt(d.readLine());
        int s,r,a=0;
        s=n;
        while(s!=0)
        {
            r=s%10;
            a=a+r*r*r;
            s=s/10;
        }
        if(a==n)
        {
            System.out.println("It is the armstrong number");
        }
        else
        {
            System.out.println("It is  not an armstrong number");
        }
            
    }
}
   
