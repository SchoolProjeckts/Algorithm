package Graph.Algoritms;

import Graph.Node;

import java.util.*;
import java.util.stream.Stream;

public class DijsktrasAlgorithm {
     public void shortestPath(Node source) {
         source.setDistnace(0);
         Set<Node> settledNodes = new HashSet<>();
         Queue<Node> unsettledNodes = new PriorityQueue<>(Collections.singleton(source));

         while (!unsettledNodes.isEmpty()) {
             Node currentNode = unsettledNodes.poll();
             currentNode.getAdjacentNodes()
                     .entrySet()
                     .stream()
                     .filter(entry -> !settledNodes.contains(entry.getKey()))
                     .forEach(entry -> {
                         evaluateDistanceAndPath(entry.getKey(), entry.getValue(), currentNode);
                         unsettledNodes.add(entry.getKey());
                     });
        settledNodes.add(currentNode);
         }
     }

     public void evaluateDistanceAndPath(Node adjacentNode, Integer edgeWeight, Node sourceNode) {
         Integer newDistance = sourceNode.getDistnace() + edgeWeight;
         if((newDistance < adjacentNode.getDistnace())) {
             adjacentNode.setDistnace(newDistance);
             adjacentNode.setShortestPath(
                     Stream.concat(sourceNode.getShortestPath().stream(), Stream.of(sourceNode)).toList()
             );
         }
     }
}
