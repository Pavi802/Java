
import java.io.*;
class vowel
{
    public static void main(String args[])throws  IOException
    {
        DataInputStream d= new DataInputStream(System.in);
        System.out.print("The Character is=");
        char c=d.readLine().charAt(0);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        {
            System.out.println("The character is Vowel");
        }
        else
        {
            System.out.println("The Character is Consonant");
        }
        
    }
}
