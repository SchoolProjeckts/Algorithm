package Search;

/**
 * This is a searching algorithm that splits the
 * array in halft and chech the middel most ellement if its
 * the element you are seraching for.
 * If it is higher than it does it aging with the right sub three
 * If it is smaller that it does it again with the left sub three
 * It uses recursion.
 *
 * It has a time complexity of O(log(n))
 * It has a space complexity of O(1)
 *
 * @author Ole Kristian
 * @version 1.0
 */
public class BinarySearch {

    public int binarySearch(int array[], int x, int l, int r) {
        if(r >= l) {
            int mid = l + (r-l)/2;
            if(array[mid] == x) {
                return array[mid];
            }
            if (array[mid] > x) {
               return binarySearch(array, x, l, mid-1);
            }
            if(array[mid] < x) {
                return binarySearch(array, x, mid + 1, r);
            }
        }
        return -1;
    }
}
