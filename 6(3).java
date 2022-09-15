//Find the Sum of Natural Numbers using Recursion

import java.io.*;
class AddNumbers {
        public static void main(String[] args)throws IOException
        {
            DataInputStream d= new DataInputStream(System.in);
            System.out.print("Enter the number=");
            int n = Integer.parseInt(d.readLine());
            int s = addNumbers(n);
            System.out.println(" the Sum is = " + s);
         }
    public static int addNumbers(int n) {
        if (n!= 0)
            return n + addNumbers(n - 1);
        else
            return n;
    }
}
