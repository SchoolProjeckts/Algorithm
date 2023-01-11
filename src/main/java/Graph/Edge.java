package Graph;

import lombok.Data;

@Data
public class Edge {
    private final int weight;
    private boolean included;

    public Edge(int weight, boolean included) {
        this.weight = weight;
        this.included = included;
    }
}
