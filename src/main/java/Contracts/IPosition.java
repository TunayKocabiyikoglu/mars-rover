package Contracts;

import Imps.rover.Position;
import Imps.rover.Rover;

public interface IPosition {
    Position moveOne(Rover rover);
}
