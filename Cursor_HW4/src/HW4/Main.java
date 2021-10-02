package HW4;

import HW4.PlaneShape.Shapes2D.Circle;
import HW4.PlaneShape.Shapes2D.Rectangle;
import HW4.PlaneShape.Shapes2D.Triangle;
import HW4.PlaneShape.TwoDimensionalShape;
import HW4.SpaceShape.Shapes3D.Cuboid;
import HW4.SpaceShape.Shapes3D.Sphere;
import HW4.SpaceShape.Shapes3D.SquarePyramid;
import HW4.SpaceShape.ThreeDimensionalShape;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {

        Shapes triangle = new Triangle(new TwoDimensionalShape(0, 0), new TwoDimensionalShape(4, 0), new TwoDimensionalShape(3, 2));
        Shapes circle = new Circle(new TwoDimensionalShape(0, 0), 5);
        Shapes rectangle = new Rectangle(new TwoDimensionalShape(0, 0), 7, 5);
        Shapes sphere = new Sphere(new ThreeDimensionalShape(0, 0, 0), 3);
        Shapes cuboid = new Cuboid(new ThreeDimensionalShape(0, 0, 0), 7, 5, 2);
        Shapes squarePyramid = new SquarePyramid(new ThreeDimensionalShape(3, 3, 4), 5, 6);

        Shapes[] shapes = {triangle, circle, rectangle, sphere, cuboid, squarePyramid};
        Arrays.stream(shapes).forEach(System.out::println);
    }
}
