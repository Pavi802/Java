import java.util.Arrays;
class InsertionSort {
  void insertionSort(int array[]) {
    int size = array.length;
    for (int i = 1; i < size; i++) {
      int key = array[i];
      int j = i - 1;
      while (j >= 0 && key < array[j]) {
        array[j + 1] = array[j];
        --j;
      }
      array[j + 1] = key;
    }
  }
  public static void main(String args[]) {
    int[] input = { 5,2,3,6,10 };
    InsertionSort s = new InsertionSort();
    s.insertionSort(input);
    System.out.println(Arrays.toString(input));
  }
}
