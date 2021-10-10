package rover;

import Imps.plateau.PlateauGrid;
import Imps.rover.Direction;
import Imps.rover.Processor;
import Imps.rover.Rover;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PositionTest {
    private Rover rover;

    @Before
    public void setup(){
        rover = new Rover(new Imps.rover.Position(3,2),new Direction("N","W","E"),new Processor(new PlateauGrid(5,5)));
    }

    @Test
    public void moveOneAddYTest() {
        Assert.assertEquals(rover.getPositionInfo().moveOne(rover).getY(),new Imps.rover.Position(1,3).getY());
    }
    @Test
    public void moveOneAddXTest() {
        rover.setDirection(Direction.getRightDirection(rover.getDirection()));
        Assert.assertEquals(rover.getPositionInfo().moveOne(rover).getX(),new Imps.rover.Position(4,3).getX());
    }
    @Test
    public void moveOneSubtractXTest() {
        rover.setDirection(Direction.getLeftDirection(rover.getDirection()));
        Assert.assertEquals(rover.getPositionInfo().moveOne(rover).getX(),new Imps.rover.Position(2,3).getX());
    }
    @Test
    public void moveOneSubtractYTest() {
        rover.setDirection(Direction.getLeftDirection(Direction.getLeftDirection(rover.getDirection())));
        Assert.assertEquals(rover.getPositionInfo().moveOne(rover).getY(),new Imps.rover.Position(1,1).getY());
    }

}
