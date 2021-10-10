package rover;


import Imps.rover.Direction;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DirectionTest {
    Direction north;
    Direction west;
    Direction south;
    Direction east;

    @Before
    public void setup() {
         north = new Direction("N", "W", "E");
         west = new Direction("W", "S", "N");
         south =  new Direction("S", "E", "W");
         east = new Direction("E", "N", "S");
    }
    @Test
    public void getLeftTest() {
        assertEquals(Direction.getLeftDirection(north).getDirection(), west.getDirection());
        assertEquals(Direction.getLeftDirection(south).getDirection(), east.getDirection());
    }

    @Test
    public void getRightTest() {
        assertEquals(Direction.getRightDirection(north).getDirection(), east.getDirection());
        assertEquals(Direction.getRightDirection(south).getDirection(), west.getDirection());
    }

}
