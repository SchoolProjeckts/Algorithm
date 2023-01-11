package Search;

public class JumpSearch {

    LinearSearch linearSearch = new LinearSearch();

    /**
     * Search for a number in an array using jump search
     * @param array the list you want to do a search in
     * @param x the valu you want to find
     * @return the value you found
     */
    public int jumpsearch(int array [], int x) {
        int jump = (int) Math.floor(Math.sqrt(array.length));
        int current = 0;

        while (current < array.length && array[current] < x) {
            current = current + jump;
        }
        if (current >= array.length) {
            return -1;
        }
        if (array[current] == x) {
            return array[current];
        }

       return this.linearSearch.linearSearch(array, x, current);
    }
}
