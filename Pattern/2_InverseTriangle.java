import java.util.*;
public class Main
{   
    public static void main(String[] args)     
    {    
       Scanner sc=new Scanner(System.in);
       int s = sc.nextInt();    
       for (int i=s;i!=0;i--)     
        {    
           for (int j=0;j<s-i;j++)    
            {    
               System.out.print(" ");    
            }    
            for (int k=0;k<(2*i-1);k++)     
            {    
               System.out.print("*");    
            }    
           System.out.println();    
        }    
    }
} 
