import java.util.*;
public class Main
{   
    public static void main(String[] args)     
    {    
       Scanner sc=new Scanner(System.in);
     
    int input = sc.nextInt();    
    int i,j;    
    for(i=1;i<=input;i++){   
        for(j=1;j<=input;j++){
            if(i==j)    
                System.out.print("*");    
            else    
                System.out.print("0");    
      }    
    j--;    
    System.out.print("*");    
    while(j>=1){
        if(i==j)    
           System.out.print("*");    
        else    
           System.out.print("0");    
        j--;    
    }    
    System.out.println("");    
  }    
 }    
}
