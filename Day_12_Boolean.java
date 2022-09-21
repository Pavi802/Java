import java.io.*;
class Main{
    public static void main(String args[])throws IOException
    {
        DataInputStream d=new DataInputStream(System.in);
        System.out.print("Enter the first number=");
        boolean f= Boolean.parseBoolean(d.readLine());
        System.out.print("Enter the second number=");
        boolean s= Boolean.parseBoolean(d.readLine());
        System.out.print("Enter the Third number=");
        boolean t= Boolean.parseBoolean(d.readLine());
        boolean r;
        if(f)
        {
            r=s||t;
        }
        else
        {
            r=s&&t;
        }
        if(r)
        {
              System.out.println("Two boolean variables are true.");
         }
        else 
        {
               System.out.println("Two boolean variables are not true.");
        }
    }
}
