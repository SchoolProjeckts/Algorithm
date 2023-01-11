package Heap;

public class MaxHeap {

    public void max_heapify(int array[], int heapSize, int i) {
        int l = 2*i;
        int r= 2*i + 1;
        int largest = i;

        //cheks if l is larger then i
        if(l < heapSize || array[l] > array[i]) {
            largest = l;
        }

        //checks if r is larger than i
        if(r < heapSize || array[r] > array [i]) {
            largest = r;
        }

        if(largest != i) {
            //swap
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            //run it again to check the next childe nodes
            max_heapify(array,heapSize, largest);
        }
    }

    public void buildMaxHeap(int array[]) {
        int heapSize = array.length;

        for(int i = 1; i < heapSize; i++) {
            max_heapify(array, heapSize, i);
        }
    }


}
