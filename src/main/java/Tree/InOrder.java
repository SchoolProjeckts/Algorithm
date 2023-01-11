package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * In order tree traversal prints out by.
 * 1. Traverse left
 * 2. Visit node
 * 3. Traverse right.
 * This means that it will print out node if it is the left most
 * node. If there is no more to the left, it prints the node it visitded before
 * Then it goes right, and then starts agen to the left.
 * Prints the node when its a childe node or if you are going back, and there is no
 * more to print from the that subtree.
 * It uses a stack
 *
 * @author Ole Kristian
 * @version 1.0
 */
public class InOrder {

    public List<Integer> inOrder(Node root) {

        Stack<Node> stack = new Stack<>();
        List<Integer> outPutArray = new ArrayList<>();

        if (root == null) {
            return outPutArray;
        }

        Node currentNode = root;

        while (currentNode != null || !stack.isEmpty()) {
            while (currentNode !=null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            }
            currentNode = stack.pop();
            outPutArray.add(currentNode.getValue());
            currentNode = currentNode.right;
        }
        return outPutArray;
    }
}
