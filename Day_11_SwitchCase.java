import java.io.*;
class Main 
{
  public static void main(String[] args)throws IOException 
  {
    DataInputStream d=new DataInputStream(System.in);
    System.out.print("Enter the string=");
    String lang = d.readLine();
    switch(lang) 
    {
      case "1":
        System.out.println(lang + " java is famous for enterprise applications.");
        break;

      case "2":
        System.out.println(lang + "  javascript is famous for frontend and backend.");
        break;

      case "3":
        System.out.println(lang + "python  is famous for ML and AI.");
        break;

      default:
        System.out.println(lang + " not found on record.");
        break;
    }
  }
}
