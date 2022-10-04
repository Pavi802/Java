import java.util.*;
import java.io.*;
public class Time{
    int h,m,s;
    public Time(int m,int p,int k){
        this.m=m;
        this.p=p;
        this.k=k;
    }
    public static void main(String ii[]) throws IOException
    {
        DataInputStream d=new DataInputStream(System.in);
        System.out.print("Enter the Time1 Hour minutes Seconds: ");
        int m1=d.readLine();
        int p1=d.readLine();
        int k1=d.readLine();
        System.out.print("Enter the Time2 Hour minutes Seconds: ");
        int m2=d.readLine();
        int p2=d.readLine();
        int k2=d.readLine();
        Time t1=new Time(m1,p1,k1),t2=new Time(m2,p2,k2),t3;
        System.out.print("Time1 = "+t1.m+":"+t1.p+":"+t1.k+"\n");
        System.out.print("Time2 = "+t2.m+":"+t2.p+":"+t2.k+"\n");
        t3=differ(t1,t2);
        System.out.print("Difference = "+t3.m+":"+t3.p+":"+t3.k+"");
    }
    public static Time differ(Time t1,Time t2){
        Time t3=new Time(0,0,0);
        if(t1.k>t2.k){
            t2.m--;
            t2.k+=60;
        }
        t3.k=t2.k-t1.k;
        if(t1.p>t2.p){
            t2.m--;
            t2.p+=60;
        }
        t3.p=t2.p-t1.p;
        t3.m=t2.m-t1.m;
        return t3;
        
    }
}
