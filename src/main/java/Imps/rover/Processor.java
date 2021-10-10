package Imps.rover;

import Contracts.IProcessor;
import Imps.command.roverCommand.MoveRoverCommand;
import Imps.command.roverCommand.RoverCommand;
import Imps.command.roverCommand.TurnLeftRoverCommand;
import Imps.command.roverCommand.TurnRightRoverCommand;
import Imps.plateau.PlateauGrid;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class Processor implements IProcessor {
    //Processor can processInstruction & give command to Rover.
    //Processor has gridInfo
    PlateauGrid gridInfo;

    public Processor(PlateauGrid gridInfo) {
        this.gridInfo = gridInfo;
    }

    public boolean checkIsValidMove(Position newPosition) {
        if ((this.gridInfo.getTopRightX() >= newPosition.getX() && this.gridInfo.getTopRightY() >= newPosition.getY()) &&
                (newPosition.getX() >= 0 && newPosition.getY() >= 0)) {
            return true;
        } else {
            throw new IndexOutOfBoundsException("Out of plateau bounds");
        }
    }

    public void processInstruction(char[] instruction, Rover rover) {
        Map<Character, RoverCommand> instructionMap = Map.of(
                'L', new TurnLeftRoverCommand(rover),
                'R', new TurnRightRoverCommand(rover),          //Created map of roverCommands
                'M', new MoveRoverCommand(rover)
        );
        for(char instructionChar: instruction){ // Process each instruction in the array.
            if (instructionMap.containsKey(instructionChar)) { //Throw an error if map doesn't contain input.
                executeCommand(instructionMap.get(instructionChar)); //Execute corresponding rover .command
            } else {
                throw new IllegalArgumentException("Invalid instruction");
            }
        }
    }

    public void executeCommand(RoverCommand roverCommand) {
        roverCommand.execute();
    }
}
