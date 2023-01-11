package Search;

public class LinearSearch {

    /**
     * Search for a number using linear search
     * @param array the array you want to search
     * @param x the number you are looking for
     */
    public int linearSearch(int array[], int x, int index) {
        for(int i = index; i < array.length; i++) {
            if(array[i] == x) {
                return array[i];
            }
        }
        return -1;
    }
}
