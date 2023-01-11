package Graph;

import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
public class Vertex<T> {

    private final T data;
    private boolean visited;
    @ToString.Exclude
    private List<Neighbor<T>> neighbors = new ArrayList<>();

    public void addNeighbor(Vertex<T> vertex, Edge edge) {
        this.neighbors.add(new Neighbor<>(vertex, edge));
    }
}
