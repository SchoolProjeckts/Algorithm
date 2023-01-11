package Tree;

/**
 * Node use for tree algoritmgs
 *
 * @author Ole Kristian
 * @version 1.0
 */
public class Node {

    int value;
    Node left, right;

    public Node(int item) {
        this.value = item;
        left = right = null;
    }

    public int getValue() {
        return this.value;
    }
}
