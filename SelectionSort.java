public class SelectionSort implements SortingAlgorithm {
    public int min(int from, int[]a) {
        int min = from;
        for (int i = from+1;i < a.length; i++){
            if (a[i]< a[min])
                min = i;
        }
        return min;
    }
    public void swap(int high, int low, int[] a){
        int temp = a[high];
        a[high] = a[low];
        a[low] = temp;
    }
    @Override
    public void sort(int[] a) {
        for(int i = 0; i< a.length-1;i++)
            swap(i,min(i,a),a);

    }
}
