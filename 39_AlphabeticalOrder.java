import java.io.*;
public class Main
{
	public static void main(String[] args)throws IOException 
	{
	    DataInputStream d=new DataInputStream(System.in);
	    String s[]={"pavi", "dharshini", "sowndharya"};
	    if(i=0;i<2;i++)
	    {
	        if(j=i+1;j<3;j++)
	        {
	            if (s[i].compareTo(s[j]) > 0)
	            {
                   String t = s[i];
                   s[i] = s[j];
                   s[j] = t;
        }
      }
    }

    System.out.println("In order:");
    
    for(int i = 0; i < 3; i++) {
      System.out.println(s[i]);
	        }
	    }
	}
