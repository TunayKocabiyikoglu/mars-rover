package Imps.parser;

import Imps.plateau.PlateauGrid;
import Imps.rover.Direction;
import Imps.rover.Position;

public class InputParser {

    public static PlateauGrid parseGrid(String instruction) {
        String[] gridUpperRightCoordinates = instruction.split(" ");
        return new PlateauGrid(Integer.parseInt(gridUpperRightCoordinates[0]), Integer.parseInt(gridUpperRightCoordinates[1]));
    }

    public static Position parsePosition(String positionString) {
        String[] positionArray = positionString.split(" ");
        int x = Integer.parseInt(positionArray[0]);
        int y = Integer.parseInt(positionArray[1]);
        return new Position(x, y);
    }

    public static Direction parseDirection(String directionString) {
        String[] directionArray = directionString.split(" ");
        return Direction.getDirectionFromMap(directionArray[2]);
    }

    public static char[] processString(String instructionString) {
            //Processes input String and converts it into instruction array.
           return instructionString.toCharArray();

    }
}
