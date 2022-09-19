import java.io.*;
public class Main 
  {
    public static void main(String[] args) throws IOException
    {
        DataInputStream d=new DataInputStream(System.in);
        System.out.print("Enter the rows=");
        int row = Integer.parseInt(d.readLine());
        System.out.print("Enter the  column=");
        int column = Integer.parseInt(d.readLine());
        int[][] matrix = { {2, 3, 4}, {5, 6, 4} };
        display(matrix);

        int[][] transpose = new int[column][row];
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        display(transpose);
    }

    public static void display(int[][] matrix) {
        System.out.println("The matrix is: ");
        for(int[] r : matrix) {
            for (int c : r) {
                System.out.print(c+ "    ");
            }
            System.out.println();
        }
    }
}
