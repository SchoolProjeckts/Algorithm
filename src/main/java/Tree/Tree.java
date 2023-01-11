//package Tree;
//
//public interface Tree<T extends Comparable<T>> {
//    Tree<T> insert(T data);
//    void delete(T data);
//    void traverse();
//    T getMax();
//    T getMin();
//    boolean isEmpty();
//
//    private AVLnode<T> insert(T data, AVLnode<T> node) {
//        if(node == null) {
//            return new AVLnode<>(data);
//        }
//        if(data.compareTo(node.getData()) < 0) {
//            node.setLeftChilde(insert(data, node.getLeftChilde()));
//        }
//        else if(data.compareTo(node.getData()) > 0) {
//            node.setRightChilde(insert(data, node.getRightChilde()));
//        }
//        else {
//            return node;
//        }
//        updateHeight(node);
//        return applyRotation(node);
//    }
//}
