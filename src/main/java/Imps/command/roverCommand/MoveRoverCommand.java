package Imps.command.roverCommand;

import Imps.rover.Rover;

public class MoveRoverCommand extends RoverCommand {

    public MoveRoverCommand(Rover rover) {
        super(rover);
    }

    @Override
    public boolean execute() {
        rover.move();
        return false;
    }
}
