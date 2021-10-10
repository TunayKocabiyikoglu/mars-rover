package Imps.command.roverCommand;

import Imps.rover.Rover;

public class TurnLeftRoverCommand extends RoverCommand {

    public TurnLeftRoverCommand(Rover rover) {
        super(rover);
    }

    @Override
    public boolean execute() {
        rover.turnLeft();
        return false;
    }
}
