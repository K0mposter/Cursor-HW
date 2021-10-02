package HW4.PlaneShape.Shapes2D;

import HW4.Interfaces.AreaMeasurable;
import HW4.Interfaces.PerimeterMeasurable;
import HW4.PlaneShape.PlaneShape;
import HW4.PlaneShape.TwoDimensionalShape;

public class Triangle extends PlaneShape implements PerimeterMeasurable, AreaMeasurable {
    private final double bottomSide;
    private final double leftSide;
    private final double rightSide;

    public Triangle(TwoDimensionalShape firstVertex, TwoDimensionalShape secondVertex, TwoDimensionalShape thirdVertex) {
        super(firstVertex, secondVertex, thirdVertex);

        bottomSide = firstVertex.getDistance(secondVertex);
        leftSide = secondVertex.getDistance(thirdVertex);
        rightSide = thirdVertex.getDistance(firstVertex);
    }

    @Override
    public double getArea() {
        return Math.sqrt(getPerimeter() / 2 * (getPerimeter() / 2 - bottomSide) * (getPerimeter() / 2 - leftSide)
                * (getPerimeter() / 2 - rightSide));
    }

    @Override
    public double getPerimeter() {
        return bottomSide + leftSide + rightSide;
    }
}