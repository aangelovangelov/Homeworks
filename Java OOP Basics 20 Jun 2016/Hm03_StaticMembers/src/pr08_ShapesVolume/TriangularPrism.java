package pr08_ShapesVolume;

public class TriangularPrism {
    private Double baseSide;
    private Double height;
    private Double length;

    public TriangularPrism(Double baseSide, Double height, Double length) {
        this.baseSide = baseSide;
        this.height = height;
        this.length = length;
    }

    public Double getBaseSide() {
        return baseSide;
    }

    public Double getHeight() {
        return height;
    }

    public Double getLength() {
        return length;
    }
}
