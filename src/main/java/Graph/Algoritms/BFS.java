//package Graph.Algoritms;
//
//
//import Graph.Vertex;
//
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class BFS<T> {
//
//    private final Vertex<T> startVertex;
//
//    public BFS(Vertex<T> startVertex) {
//        this.startVertex = startVertex;
//    }
//
//    public void travers() {
//        Queue<Vertex<T>> queue = new LinkedList<>();
//        queue.add(startVertex);
//        while (!queue.isEmpty()) {
//            Vertex<T> current = queue.poll();
//            if(!current.isVisited()) {
//                current.setVisited(true);
//                queue.addAll(current.getNeighbors());
//            }
//        }
//    }
//}
