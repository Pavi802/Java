import java.util.*;  
import java.io.*;
public class Main 
{  
public static void main(String args[])throws IOException  
{  
int num, n2, n3;      
DataInputStream d=new DataInputStream(System.in);  
System.out.print("Enter any Number: ");  
int num = Integre.parseInt(d.readLine());  
n2 = num * 2;  
n3 = num * 3;  
String concatstr = num + "" + n2 + n3;  
boolean found = true;  
for(char c = '1'; c <= '9'; c++)  
{  
for(int i = 0; i < concatstr.length(); i++)  
{  
char ch = concatstr.charAt(i);  
count++;  
}  
if(count > 1 || count == 0)  
{  
found = false;  
break;  
}  
}  
if(found)  
System.out.println(num + " is a fascinating number.");  
else  
System.out.println(num + " is not a fascinating number.");  
}  
}  
