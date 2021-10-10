package Imps.rover;

import Contracts.IRover;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rover implements IRover {
    // A Rover has a positionInfo and a processor to process moves&turns of the rover.
    // A Rover can move & turn itself.
    private Position positionInfo; // purpose -> store positionInfos like x,y of rover.
    private Direction direction; // purpose -> store Direction of rover;
    private Processor processor; // purpose -> Processes instructions of rover.

    public Rover(Position positionInfo, Direction direction, Processor processor) {
        this.positionInfo = positionInfo;
        this.direction = direction;
        this.processor = processor;
    }

    public void move() {
        try{
            if(processor.checkIsValidMove(this.getPositionInfo().moveOne(this))){
                this.setPositionInfo(this.getPositionInfo().moveOne(this));
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public void turnLeft() {
        this.setDirection(Direction.getLeftDirection(this.getDirection()));
    }

    public void turnRight() {
        this.setDirection(Direction.getRightDirection(this.getDirection()));
    }

    @Override
    public String toString() {
        return "Rover{" +
                "positionInfo=" + positionInfo +
                ", direction=" + direction +
                '}';
    }
}
