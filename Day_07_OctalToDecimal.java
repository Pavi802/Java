import java.io.*;
class oct {
    public static void main(String[] args)throws IOException
    {
        DataInputStream d=new DataInputStream(System.in);
        System.out.print("Enter the number=");
        int decimal =Integer.parseInt(d.readLine());
        int octal = Do(decimal);
        System.out.printf("%d in decimal = %d in octal", decimal, octal);
    }
    public static int Do(int decimal)
    {
        int octalNumber = 0, i = 1;

        while (decimal != 0)
        {
            octalNumber += (decimal % 8) * i;
            decimal /= 8;
            i *= 10;
        }

        return octalNumber;
    }
}
