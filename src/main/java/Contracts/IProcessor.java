package Contracts;

import Imps.command.roverCommand.RoverCommand;
import Imps.rover.Position;
import Imps.rover.Rover;

public interface IProcessor {

    boolean checkIsValidMove(Position newPosition);

    void processInstruction(char[] instruction, Rover rover);

    void executeCommand(RoverCommand roverCommand);
}
