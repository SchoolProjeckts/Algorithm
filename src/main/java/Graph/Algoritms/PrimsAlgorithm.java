package Graph.Algoritms;

import Graph.Vertex;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public record PrimsAlgorithm<T>(List<Vertex<T>> graph) {

    public void run() {
       if(!graph.isEmpty()){
           graph.get(0).setVisited(true);
       }
       while (graph.stream().anyMatch(vertex -> !vertex.isVisited())) {
           graph.stream().filter(Vertex::isVisited)
                   .map(Vertex::getNeighbors)
                   .flatMap(Collection::stream)
                   .filter(tNeighbor -> !tNeighbor.isVisited())
                   .min(Comparator.comparingInt(n -> n.getEdge().getWeight()))
                   .ifPresent(candidate -> {
                       candidate.getVertex().setVisited(true);
                       candidate.getEdge().setIncluded(true);
                   });
       }
    }
}

