public class BubbleSort implements SortingAlgorithm{
    public void swap(int high, int low, int[] a) {
        int temp = a[high];
        a[high] = a[low];
        a[low] = temp;
    }
    @Override
    public void sort(int[] a) {
        boolean swapped = true; //if there is no swap, then we can stop checking
        int j=0;
        while(swapped){
            swapped = false;
            j++;
            for (int i = 0; i < a.length-j;i++){

                if(a[i]>a[i+1]){
                    swap(i,i+1,a);
                    swapped= true;
                }
            }
        }

    }
}
