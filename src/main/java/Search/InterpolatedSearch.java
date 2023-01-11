package Search;

/**
 * This a searching algorithm that uses a mathematically
 * pos = Ymin + ((X-Xmin)/(Xmax - Xmin)) * (Ymax - Ymin)
 * Every time it compute a position it checks if it is the correct
 * value, if not the algorithm checks if it is higher or lover that
 * the value its searching for. If its is lover it runs the algorithm
 * again where from position and to the max of the array.
 * If it is lover it does them same but pos is the end where it stops
 * It uses recursion to run the algorithm again.
 *
 * It has a time complexity of O(log(log(n)))
 * It has a space complexity of O(1)
 *
 * @author Ole Kristian
 * @version 1.0
 */
public class InterpolatedSearch {

    public int interpolatedSearch(int array[], int l, int r, int x) {
        int pos = -1;
        if (l <= r && x >= array[l] && x <= array[r]) {
            pos = l + ( ((x-array[l]) * (r-l)) / (array[r] - array[l]) );
        }
        if(array[pos] == x) {
            return array[pos];
        }
        if(array[pos] < x) {
            interpolatedSearch(array, pos + 1, r, x);
        }
        if (array[pos] > x) {
            interpolatedSearch(array, l, pos - 1,x);
        }
        return -1;
    }
}
