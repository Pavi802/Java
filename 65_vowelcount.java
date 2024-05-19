import java.io.*;
class cv
{
  public static void main(String args[])throws IOException
  {
    DataInputStream d=new DataInputStream(System.in);
    System.out.println("Enter the string=");
    String s=d.readLine();
    int count=0;
    for(int i=0;i<s.length();i++)
    {
      if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
      {
        count=count+1;
      }
    }
   System.out.println(""+count);
  }
}
