class QuickSort{
  public static void main(String[] args)
  {
    var arr=new int[]{23,8,1,5,7,3};
  }
public void quickSort(int arr[], int begin, int end) {
    if (begin < end) {
        int mid = partition(arr, begin, end);

        quickSort(arr, begin, mid-1);
        quickSort(arr, mid+1, end);
    }
}
private int partition(int arr[], int begin, int end) {
    int pivot = arr[end];
    int i = (begin-1);

    for (int j = begin; j < end; j++) {
        if (arr[j] <= pivot) {
            i++;

            int swap = arr[i];
            arr[i] = arr[j];
            arr[j] = swap;
        }
    }

    int swap = arr[i+1];
    arr[i+1] = arr[end];
    arr[end] = swap;

    return i+1;
}
}
