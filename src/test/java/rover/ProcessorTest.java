package rover;

import Imps.plateau.PlateauGrid;
import Imps.rover.Direction;
import Imps.rover.Processor;
import Imps.rover.Rover;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProcessorTest {
    char[] instruction;
    private Rover rover;

    @Before
    public void setup(){
        instruction = new char[]{'L', 'M', 'L', 'M', 'L', 'M', 'L', 'M', 'L', 'M', 'M'};
        rover = new Rover(new Imps.rover.Position(3,2),new Direction("N","W","E"),new Processor(new PlateauGrid(5,5)));

    }

    @Test(expected = IllegalArgumentException.class)
    public void processInstructionTestException() {
        instruction[0] = 'T';
        rover.getProcessor().processInstruction(instruction, rover);
    }

    @Test
    public void processInstructionTest() {
        int y = 2;
        String direction = "W";
        rover.getProcessor().processInstruction(instruction, rover);
        Assert.assertEquals(y, rover.getPositionInfo().getY());
        Assert.assertEquals(direction, rover.getDirection().getDirection());
    }
}
