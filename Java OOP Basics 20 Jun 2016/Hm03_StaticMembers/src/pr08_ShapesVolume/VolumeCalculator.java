package pr08_ShapesVolume;


public class VolumeCalculator {

    private static final double PI = 3.14159265359;

    public static Double volume(TriangularPrism prism) {
        return prism.getBaseSide() * prism.getLength() / 2 * prism.getHeight();
    }

    public static Double volume(Cylinder cylinder) {
        return PI * Math.pow(cylinder.getRadius(), 2) * cylinder.getHeight();
    }

    public static Double volume(Cube cube) {
        return Math.pow(cube.getSideLength(), 3);
    }
}
