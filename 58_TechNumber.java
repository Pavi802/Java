import java.io.*;
public class Main  
  {  
    public static void main(String args[])throws IOException  
    {  
      DataInputStream d=new DataInputStream(System.in);
      System.out.println("Enter the number: ");  
      int n=Integer.parseInt(d.readLine());
      for (int i = 1; i <=n; i++)   
       {  
         int p1 = i % 100;  
         int p2 = i / 100;  
         int sum = p1 + p2;  
         if (i == (sum * sum))  
         System.out.println(i);  
       }  
    }  
}  
