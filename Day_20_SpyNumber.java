import java.io.*;
public class Main  
   {  
     public static void main(String args[])throws IOException  
      { 
         int prod=1, sum=0, last;  
         DataInputStream d=new DataInputStream(System.in);
         System.out.print("Enter the number=");
         int n=Integer.parseInt(d.readLine());  
         while(n>0)  
         {  
           last=n%10;  
           sum=sum+last;  
           prod=prod*last;  
           n=n/10;  
         }  
    if(sum==prod)  
           System.out.println("The number is a spy number.");  
    else  
           System.out.println("The  number is not a spy number.");  
      }  
    }  
