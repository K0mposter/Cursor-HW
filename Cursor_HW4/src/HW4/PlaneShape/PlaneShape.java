package HW4.PlaneShape;

import HW4.Interfaces.AreaMeasurable;
import HW4.Interfaces.PerimeterMeasurable;
import HW4.Shapes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class PlaneShape extends Shapes implements AreaMeasurable, PerimeterMeasurable {
    private final List<TwoDimensionalShape> listVertices = new ArrayList<>();

    public PlaneShape(TwoDimensionalShape... arrayVertices) {
        listVertices.addAll(Arrays.asList(arrayVertices));
    }

    public List<TwoDimensionalShape> getArrayBetweenVertices() {
        return listVertices;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " vertex= " + getArrayBetweenVertices().toString() + "; perimeter= " + getPerimeter()
                + "; area= " + getArea();
    }

}
