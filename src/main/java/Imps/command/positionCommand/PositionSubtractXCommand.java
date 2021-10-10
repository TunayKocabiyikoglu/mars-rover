package Imps.command.positionCommand;

import Imps.rover.Position;

public class PositionSubtractXCommand extends PositionCommand{

    public PositionSubtractXCommand(Position position) {
        super(position);
    }

    @Override
    public Position execute() {
        return new Position(position.getX() - 1, position.getY());
    }
}
