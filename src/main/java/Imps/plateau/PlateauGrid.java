package Imps.plateau;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlateauGrid {
    private int topRightX;
    private int topRightY;

    public PlateauGrid(int topRightX, int topRightY) {
        this.topRightX = topRightX;
        this.topRightY = topRightY;
    }

    @Override
    public String toString() {
        return "Grid{" +
                "topRightX=" + topRightX +
                ", topRightY=" + topRightY +
                '}';
    }
}
