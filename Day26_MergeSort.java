class MergeSort
{
    public static void main(String[] args)
    {
        var array= new int[]{9,3,5,1,35,28,22,34,18,93,46};
        divide(array);
        for(int output:array)
        {
            System.out.print(output+ " ");
        }
    }
    public static void divide(int[] array)
    {
        if(array==null || array.length<=1)
        {
            return;
        }
        int mid=array.length/2;
        int[] left=new int[mid];
        int[] right=new int[array.length-mid];
        System.arraycopy(array,0,left,0,mid);
        if(array.length-mid>=0)
        {
            System.arraycopy(array,mid,right,0,array.length-mid);
        }
        divide(left);
        divide(right);
        combine(left,right,array);
    }
    private static void combine(int[] left, int[] right, int[]array)
    {
        int i=0,j=0,k=0;
        while(i<left.length && j<right.length)
        {
            if(left[i]<=right[j])
            {
                array[k++]=left[i++];
            }
            else
            {
                array[k++]=right[j++];
            }
        }
        while(i<left.length)
        {
            array[k++]=left[i++];
        }
        while(j<right.length)
        {
            array[k++]=right[j++];
        }
    }
}
