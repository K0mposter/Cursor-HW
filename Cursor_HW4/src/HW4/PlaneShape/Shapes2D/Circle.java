package HW4.PlaneShape.Shapes2D;

import HW4.Interfaces.AreaMeasurable;
import HW4.Interfaces.PerimeterMeasurable;
import HW4.PlaneShape.PlaneShape;
import HW4.PlaneShape.TwoDimensionalShape;

public class Circle extends PlaneShape implements PerimeterMeasurable, AreaMeasurable {

    private final double radius;

    public Circle(TwoDimensionalShape vertex, double radius) {
        super(vertex);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}