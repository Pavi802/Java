import java.io.*;
public class Main
  {
     public static void main(String[] args)throws IOException 
     {
         DataInputStream d=new DataInputStream(System.in);
         System.out.print("Enter the rows=");
         int r =Integer.parseInt(d.readLine());
         System.out.print("Enter the columns=");
         int c =Integer.parseInt(d.readLine());
         int FM[][] = new int[20][30]; 
         int SM[][] = new int[20][30] ;
         int[][] sum = new int[r][c];
         for(int i = 0; i < r; i++)
         {
            for (int j = 0; j < c; j++)
            {
                sum[i][j] = FM[i][j] + SM[i][j];
            }
        }
        System.out.println("The Sum is: ");
        for(int[] ro : sum)
        {
            for (int co : ro) 
            {
                System.out.print(c + "    ");
            }
            System.out.println();
        }
    }
}
