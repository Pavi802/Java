import java.util.*;
public class Main{  
public static void main(String []args)
{  
    Scanner sc=new Scanner(System.in);
    int count=sc.nextInt();
    int i,j;  
    for(i=1;i<=count;i++)
    {
       for(j=count;j>=1;j--)
       { 
        if(j!=i)  
           System.out.print(j);  
        else  
            System.out.print("*");  
    }  
   System.out.println("");  
   }  
 }
}
