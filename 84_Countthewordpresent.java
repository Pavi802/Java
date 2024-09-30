import java.util.*;
public class word{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String m=sc.nextLine();
        String sear=sc.nextLine();
        int count=0;
        for(int i=0;i<m.length()-sear.length();i++){
            if(m.substring(i, i + sear.length()).equals(sear)){
                count++;
            }
        }
        System.out.println(count);
    }
}
