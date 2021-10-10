package Imps.command.roverCommand;

import Imps.rover.Rover;

public abstract class RoverCommand {
    Rover rover;

    RoverCommand(Rover rover) {
        this.rover = rover;
    }

    public abstract boolean execute();

}
