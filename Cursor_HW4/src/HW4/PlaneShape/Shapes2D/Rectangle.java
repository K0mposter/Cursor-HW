package HW4.PlaneShape.Shapes2D;

import HW4.Interfaces.AreaMeasurable;
import HW4.Interfaces.PerimeterMeasurable;
import HW4.PlaneShape.PlaneShape;
import HW4.PlaneShape.TwoDimensionalShape;

public class Rectangle extends PlaneShape implements PerimeterMeasurable, AreaMeasurable {
    private final double width;
    private final double height;

    public Rectangle(TwoDimensionalShape vertex, double width, double height) {
        super(vertex);
        this.width = width;
        this.height = height;

    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}