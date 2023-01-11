package Tree;

import lombok.Data;
import lombok.NonNull;

@Data
public class AVLnode<T extends Comparable<T>> {

    @NonNull private T data;
    private AVLnode<T> leftChilde;
    private AVLnode<T> rightChilde;
    private int height = 1;
}
