package Imps.command.roverCommand;

import Imps.rover.Rover;

public class TurnRightRoverCommand extends RoverCommand {

    public TurnRightRoverCommand(Rover rover) {
        super(rover);
    }

    @Override
    public boolean execute() {
        rover.turnRight();
        return false;
    }
}
