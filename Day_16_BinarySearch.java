import java.io.*;
class Main{
    public static int bsearch(int a[],int first,int last,int key){
        if(last>=first){
            int mid=first+(last-first)/2;
            if(a[mid]==key){
                return mid;
            }
            if(a[mid]>key){
                return bsearch(a,first,mid-1,key);
            }
            else{
                return bsearch(a,first,mid+1,key);
            }
            }
            return -1;
        }
        public static void main(String args[])throws IOException
        {
            DataInputStream d=new DataInputStream(System.in);
            int a[]={10,20,30,40,48};
            int key=Integer.parseInt(d.readLine());
            int last=a.length-1;
            int result=bsearch(a,0,last,key);
            if(result==-1){
                System.out.print("Element not found");
            }
            else{
                System.out.print("Element found");
            }
        }
    }
