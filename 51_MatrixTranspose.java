import java.util.*;
public class transpose{
 public static void main(String ar[])throws Exception
 { 
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the first matrix row value:");
  int n=sc.nextInt();
  System.out.println("enter the first matrix column value:");
  int m=sc.nextInt();
  int a[][]=new int[n][m];
   int b[][]=new int[m][n];
  for(int i=0;i<n;i++)
  {
   for(int j=0;j<m;j++)
   {
    a[i][j]=sc.nextInt();
    }
 }
for(int i=0;i<n;i++)
 {
  for(int j=0;j<m;j++)
  {
     b[i][j]=a[j][i];   
  }
  
}
for(int i=0;i<m;i++)
{
 for(int j=0;j<n;j++)
 {
System.out.print(b[i][j]+" ");
}
System.out.print("\n"); 
}
}
}
