class m {
    public static void main(String[] args) {
       String input="muruganantham,industry#murugananthamdeveloper";
       int index = input.indexOf('#');
       if(index!=-1){
           System.out.println("" +input.substring(index+1));
       }
       else{
           System.out.println(" ");
       }
    }
}
