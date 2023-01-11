package Sort;

/**
 * Sorting algorithm that checks a eliment
 * in the list up ageainst the outer elements.
 * First you check Index 0. You see if eny element is
 * lower than the element at the index. When you have
 * gone true the list, you swap the eliment in the index
 * with the eliment that was the lowerst. Then you do i
 * again with the next index.
 *
 * This algorithm has the worst time complexity of O(n^2)
 * This algorithm has the average time complexity of O(n^2)
 * This algorithm has the best time complexity of O(n)
 * This algorithm has the space of O(1)
 *
 * @author Ole Kristian
 * @version 1.0
 */
public class SelectionSort {

    public void selectionSourt(int array[]) {
        for(int i = 0; i < array.length; i++) {
            int currentMin = i;
            for(int j = i; j < array.length; j++) {
                if(array[currentMin] > array[j]) {
                    currentMin = j;
                }
            }
            int temp = array[currentMin];
            array[currentMin] = array[i];
            array[i] = temp;
        }
    }
}
