package HW4.SpaceShape.Shapes3D;

import HW4.SpaceShape.SpaceShape;
import HW4.SpaceShape.ThreeDimensionalShape;

public class Sphere extends SpaceShape {
    private final double radius;

    public Sphere(ThreeDimensionalShape vertex, double radius) {
        super(vertex);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        return (4 * Math.PI * Math.pow(radius, 3)) / 3;
    }
}