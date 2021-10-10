package rover;

import Imps.plateau.PlateauGrid;
import Imps.rover.Direction;
import Imps.rover.Processor;
import Imps.rover.Rover;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RoverTest {
    private Rover rover;

    @Before
    public void setup(){
        rover = new Rover(new Imps.rover.Position(3,2),new Direction("N","W","E"),new Processor(new PlateauGrid(5,5)));
    }

    @Test
    public void moveTest(){
        rover.move();
        Assert.assertEquals(3,rover.getPositionInfo().getY());
    }
    @Test
    public void moveExceptionTestYWillStaySame(){
        rover.getPositionInfo().setY(5);
        rover.move();
        Assert.assertEquals(5,rover.getPositionInfo().getY());
    }
}
