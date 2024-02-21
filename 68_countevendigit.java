class Solution {
    public static void main(String[] args)
    {
       int value=123456;
       int count=0,r;
       while(value>0)
       {
           r=value%10;
           if(r%2==1)
               count++;
           value=value/10;
       }
       System.out.print(+count);
       if(count==0)
           System.out.print("0");
    }
}





Output:
3
