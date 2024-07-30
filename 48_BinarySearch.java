import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        DataInputStream br=new DataInputStream(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = Integer.parseInt(br.readLine());
        
        int[] array = new int[n];
        System.out.println("Enter the array elements (sorted):");
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        // Ensure the array is sorted (optional if you trust user input is always sorted)
        Arrays.sort(array);
        
        System.out.print("Enter the element to search for: ");
        int target = Integer.parseInt(br.readLine());
        
        int result = binarySearch(array, target);
        
        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
    
    // Binary Search Method
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (array[mid] == target) {
                return mid;
            }
            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1;  // Target not found
    }
}
