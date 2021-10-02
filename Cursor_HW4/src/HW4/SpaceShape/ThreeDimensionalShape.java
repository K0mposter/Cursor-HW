package HW4.SpaceShape;

import HW4.PlaneShape.TwoDimensionalShape;

public class ThreeDimensionalShape extends TwoDimensionalShape {
    private double z;

    public ThreeDimensionalShape(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "(" + super.toString() + ";" + getZ() + ')';
    }
}
