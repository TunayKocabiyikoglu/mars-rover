import Imps.parser.InputParser;
import Imps.plateau.PlateauGrid;
import Imps.rover.Processor;
import Imps.rover.Rover;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Rover> rovers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        PlateauGrid grid = InputParser.parseGrid(scanner.nextLine());
        while(scanner.hasNext()) {
            String positionAndDirection = scanner.nextLine();
            Rover rover = new Rover(InputParser.parsePosition(positionAndDirection), InputParser.parseDirection(positionAndDirection),new Processor(grid));
            rovers.add(rover);
            rover.getProcessor().processInstruction(InputParser.processString(scanner.nextLine()), rover);
            System.out.println(rover);
        }
    }
}
