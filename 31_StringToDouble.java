import java.io.*;
class Main 
{
  public static void main(String[] args)throws IOException 
  {
    DataInputStream d=new DataInputStream(System.in);
    System.out.print("Enter the string=");
    String s1 =d.readLine();
    double d1 = Double.parseDouble(s1);
    System.out.println(d1);    
        
  }
}
