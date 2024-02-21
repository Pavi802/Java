import java.io.*;
class Main
  {
     public static void main (String[] args)throws IOException 
     {
         DataInputStream d=new DataInputStream(System.in);
         System.out.print("Enter the integer=");
         int n= Integer.parseInt(d.readLine());
         String s=String.valueOf(n);
         System.out.print(s);
     }
  }
