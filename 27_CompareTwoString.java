import java.io.*;
public class Main 
{
    public static void main(String[] args)throws IOException
    {
        DataInputStream d=new DataInputStream(System.in);
        System.out.print("Enter the First string=");
        String s1 =d.readLine();
        System.out.print("Enter the Second string=");
        String s2 =d.readLine();

        if(s1 == s2)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}
