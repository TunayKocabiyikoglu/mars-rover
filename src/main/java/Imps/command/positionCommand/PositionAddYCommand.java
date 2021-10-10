package Imps.command.positionCommand;

import Imps.rover.Position;

public class PositionAddYCommand extends PositionCommand{

    public PositionAddYCommand(Position position) {
        super(position);
    }

    @Override
    public Position execute() {
        return new Position(position.getX(), position.getY() + 1);
    }
}
