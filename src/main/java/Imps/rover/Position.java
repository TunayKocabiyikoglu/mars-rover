package Imps.rover;

import Contracts.IPosition;
import Imps.command.positionCommand.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class Position implements IPosition {
    //Position has x&y of the rover.
    //Position can increase or decrease x&y of rover.
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position moveOne(Rover rover) {
        Map<String, PositionCommand> positionCommandMap = Map.of(
                "N", new PositionAddYCommand(rover.getPositionInfo()),
                "W", new PositionSubtractXCommand(rover.getPositionInfo()),
                "S", new PositionSubtractYCommand(rover.getPositionInfo()),
                "E", new PositionAddXCommand(rover.getPositionInfo())
        );
        return positionCommandMap.get(rover.getDirection().getDirection()).execute();
    }

    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
