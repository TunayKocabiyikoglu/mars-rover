package Imps.rover;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;


@Getter
@Setter
public class Direction {
    //Direction has direction of rover and its left and right directions.
    private final String direction;
    private String left;
    private String right;

    private static Map<String,Direction> directionMap = Map.of(
            "N", new Direction("N", "W", "E"),
            "W", new Direction("W", "S", "N"),
            "S", new Direction("S", "E", "W"),
            "E", new Direction("E", "N", "S")
    );

    public Direction(String direction, String left, String right) {
        this.direction = direction;
        this.left = left;
        this.right = right;
    }

    public static Direction getDirectionFromMap(String direction){
        return directionMap.get(direction);
    }

    public static Direction getLeftDirection(Direction direction){
        return getDirectionFromMap(direction.getLeft());
    }

    public static Direction getRightDirection(Direction direction){
        return getDirectionFromMap(direction.getRight());
    }

    @Override
    public String toString() {
        return "Direction{" +
                "direction='" + direction + '\'' +
                '}';
    }
}
