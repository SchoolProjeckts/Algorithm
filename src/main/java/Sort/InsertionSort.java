package Sort;

/**
 * Insertion sort is a sorting algorithm.
 * This algorithm takes a index, and check the index to the right
 * of it if it is bigger or smaler, if it is they swap place.
 * It does this until the element to the right is smaler. Then
 * It start at index 0. When it is done it checks the next element.
 *
 * This algorithm has the worst time complexity of O(n^2)
 * This algorithm has the average time complexity of O(n^2)
 * This algorithm has the best time complexity of O(n)
 * This algorithm has the space of O(1)
 *
 * @author Ole Kristian
 * @version 1.0
 */
public class InsertionSort {

    public void insertionSort(int array[]) {
        for(int i = 0; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >=0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
    }
}
