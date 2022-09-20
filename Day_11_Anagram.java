import java.io.*;
import java.util.Arrays;

class Main {
  public static void main(String[] args)throws IOException 
  {
     DataInputStream d=new DataInputStream(System.in);
     System.out.print("Enter the first string=");
     String s1 = d.readLine();
     System.out.print("Enter the second string=")''
     String s2 = d.readLine();
    
    s1 = s1.toLowerCase();
    s2 = s2.toLowerCase();
    if(s1.length() == s2.length()) {
      char[] A1 = s1.toCharArray();
      char[] A2 = s2.toCharArray();
      Arrays.sort(A1);
      Arrays.sort(A2);
      boolean r = Arrays.equals(A1, A2);

      if(r) {
        System.out.println("The two strings are anagram.");
      }
      else {
        System.out.println("The two strings are not anagram.");
      }
    }
    else {
      System.out.println(" The two strings are not anagram.");
    }
  }
}
