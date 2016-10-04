package pr08_ShapesVolume;

public class Cylinder {
    //radius> <height
    private Double radius;
    private Double height;

    public Cylinder(Double radius, Double height) {
        this.radius = radius;
        this.height = height;
    }

    public Double getHeight() {
        return height;
    }

    public Double getRadius() {
        return radius;
    }
}
