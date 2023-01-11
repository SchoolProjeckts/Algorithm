package Graph;

import lombok.Data;

@Data
public class Neighbor<T> {

    private final Vertex<T> vertex;
    private final Edge edge;

    public Neighbor(Vertex<T> vertex, Edge edge) {
        this.vertex = vertex;
        this.edge = edge;
    }

    public boolean isVisited() {
        return this.edge.isIncluded() || this.vertex.isVisited();
    }
}
