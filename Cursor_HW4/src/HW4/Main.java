package HW4;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import HW4.Interfaces.AreaMeasurable;
import HW4.Interfaces.VolumeMeasurable;
import HW4.Interfaces.PerimeterMeasurable;

public class Main {

    public static void main(String[] args) {

    }
}

abstract class Shapes {
}

abstract class PlaneShape extends Shapes implements AreaMeasurable, PerimeterMeasurable {


}

abstract class SpaceShape extends Shapes implements AreaMeasurable, VolumeMeasurable {


}