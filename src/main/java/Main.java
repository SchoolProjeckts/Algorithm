import Search.InterpolatedSearch;

public class Main {
    public static void main(String args[]) {
        int array[] = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};
//        LinearSearch linearSearch = new LinearSearch();
//       // System.out.println(linearSearch.linearSearch(array, 4, 0));
//        JumpSearch jumpSearch = new JumpSearch();
//        //System.out.println(jumpSearch.jumpsearch(array, 11));
//        BinarySearch binarySearch = new BinarySearch();
//        System.out.println(binarySearch.binarySearch(array, 17, 0,array.length-1));
        InterpolatedSearch interpolatedSearch = new InterpolatedSearch();
        System.out.println(interpolatedSearch.interpolatedSearch(array, 0, array.length-1,13));

        //int array[] = new int[] {4,5,2,3,7,1};
        //InsertionSort insertionSort = new InsertionSort();
        //insertionSort.insertionSort(array);
        //SelectionSort selectionSort = new SelectionSort();
        //selectionSort.selectionSourt(array);
        //BubbleSoirt bubbleSoirt = new BubbleSoirt();
        //bubbleSoirt.bubbleSort(array);

        //for(int i = 0; i < array.length; i++) {
          //  System.out.println(array[i]);
        //}
    }
}
