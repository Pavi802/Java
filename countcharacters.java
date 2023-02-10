class character
{
  public static void main(String args[])
  {
    String s="Welcome";
    char c='e';
    int count=0;
    for(int i=0;i<s.length();i++)
    {
      if(s.charAt(i)==c)
        count++
    }
    System.out.println(""+count);
    if(count==0)
      System.out.println("NA");
  }
}





OUTPUT:
1)  input=Welcome
          e
    output=2
2) input=Welcome
         i
   output=NA
