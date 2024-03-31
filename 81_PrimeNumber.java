import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		
		boolean flag=false;
		for(int i=2;i<n;i++){
		    if(n%i==0){
		        flag=true;
		        break;
		    }
		}
		if(flag){
		      System.out.println("Not a prime number");
		  }
		else{
		    System.out.println("Prime number");
		}
  }
}
