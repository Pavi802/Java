import java.io.*;
public class Main
{
    public static void main(String args[])throws IOException
    {
        DataInputStream d=new DataInputStream(System.in);
        String s1 = null;
        String s2 = "";
        String s3 = "  ";
        System.out.println("string1 is " + isNullEmpty(s1));
        System.out.println("string2 is " + isNullEmpty(s2));
        System.out.println("string3 is " + isNullEmpty(s3));
    }
    public static String isNullEmpty(String str) {
    if (str == null) 
    {
      return "NULL";
    }
    else if(str.isEmpty()){
      return "EMPTY";
    }
    else 
    {
      return "neither NULL nor EMPTY";
    }
  }
}
