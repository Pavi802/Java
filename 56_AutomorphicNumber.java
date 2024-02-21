import java.util.Scanner; 
import java.io.*;
public class Main 
   {  
     public static void main(String args[])throws IOException  
     {  
        DataInputStream d = new DataInputStream(System.in);  
        System.out.print("Enter a number to check: ");  
        int n = Integer.parseInt(d.readLine());  
        int count=0,temp=0;  
        int square = n*n;  
        while(temp>0)  
        {  
            count++;  
            temp=temp/10;  
        }
       int lastDigit = (int) (square%(Math.pow(10, count)));   

if(n == lastDigit)  
       System.out.println(" It is an automorphic number.");  
else  
System.out.println(" It is not an automorphic number.");  
}  
}  
