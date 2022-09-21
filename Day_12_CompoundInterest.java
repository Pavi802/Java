import java.io.*;

class Main {
  public static void main(String[] args) throws IOException
  {
    DataInputStream d=new DataInputStream(System.in);
    System.out.print("Enter the P value: ");
    double p = Double.parseDouble (d.readLine());
    System.out.print("Enter the R value: ");
    double r =Double.parseDouble(d.readLine());
    System.out.print("Enter the N value: ");
    double n = Double.parseDouble(d.readLine());
    System.out.print("Enter the number of times compounded: ");
    double num = Double.parseDouble(d.readLine());
    
    double CI = p * (Math.pow((1 + r/100), (n * num))) - p;

    System.out.println(" The Compound Interest is= " + CI);

  }
}
