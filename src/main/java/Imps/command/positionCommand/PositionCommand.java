package Imps.command.positionCommand;

import Imps.rover.Position;

public abstract class PositionCommand {

    Position position;

    PositionCommand(Position position) {
        this.position = position;
    }

    public abstract Position execute();
}
