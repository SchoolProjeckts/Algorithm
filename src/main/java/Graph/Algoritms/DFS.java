//package Graph.Algoritms;
//
//import Graph.Vertex;
//
//import java.util.Deque;
//import java.util.LinkedList;
//
//public class DFS<T> {
//
//    public void travers(Vertex<T> startVertex) {
//        Deque<Vertex<T>> stack = new LinkedList<>();
//        stack.push(startVertex);
//        while (!stack.isEmpty()) {
//            Vertex<T> current = stack.pop();
//            if(!current.isVisited()) {
//                current.setVisited(true);
//                current.getNeighbors().forEach(stack::push);
//            }
//        }
//
//    }
//}
