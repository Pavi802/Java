import java.io.*;
class java
{
     public static void main(String args[])throws IOException
     {
          DataInputStream d =new DataInputStream(System.in);
          String s = d.readLine();
          int character = 0, space =0,special=0;
          //char c=' ';
          for(int i=0;i<s.length();i++)
          {
             if(s.charAt(i)>='a' && s.charAt(i)<='z')
                            character++;
             else if(s.charAt(i)==' ')
                             space++;
             else 
                 special++;
            }
            System.out.println("Character=" +character);
            System.out.println("space=" +space);
            System.out.println("special Character=" +special);
      }
}
