public class Main {  
    public static void main(String[] args) {  
        int [] arr = new int [] {8, 81, 97, 68, 23};  
        int max = arr[0];  
        for (int i = 0; i < arr.length; i++) {  
           if(arr[i] > max)  
               max = arr[i];  
        }  
        System.out.println("The element is : " + max);  
    }  
}  
