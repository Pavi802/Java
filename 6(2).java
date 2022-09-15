// perform a simple calculator:

import java.util.Scanner;
import java.io.*;
class Main {
  public static void main(String[] args)throws IOException
  {
    DataInputStream d = new DataInputStream(System.in);
    char op;
    Double r;
    System.out.println("Enter any operator=");
    op = d.readLine().charAt(0);
    System.out.println("Enter first number");
    double n1=Double.parseDouble(d.readLine());
    System.out.println("Enter second number");
    double n2=Double.parseDouble(d.readLine());
    switch (op) {
      case '+':
        r = n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " + r);
        break;
      case '-':
        r = n1 - n2;
        System.out.println(n1 + " - " + n2 + " = " + r);
        break;
      case '*':
        r= n1 * n2;
        System.out.println(n1 + " * " + n2 + " = " + r);
        break;
      case '/':
        r = n1 / 2;
        System.out.println(n1 + " / " + n2 + " = " + r);
        break;
      default:
        System.out.println("Invalid operator!");
        break;
    }

    d.close();
  }
}
