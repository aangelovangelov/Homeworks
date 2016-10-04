package pr01_ClassBox;

public class Box {

    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getSurfaceArea() {
        return 2 * (this.length * this.width + this.width * this.height + this.height * this.length);
    }

    public double getLateralSurfaceArea() {
        return 2 * (this.length * this.height + this.width * this.height);
    }

    public double getVolume() {
        return this.length * this.height * this.width;
    }
}
