package SemestrTwo.OOPClasses.Parallelepiped;

public class Parallelepiped {
    private double length;
    private double width;
    private double height;

    public Parallelepiped(double length, double width, double height) throws Exception {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    private void setLength(double length) throws Exception {
        if (length > 0) {
            this.length = length;
        } else {
            throw new Exception("Length cannot be zero or negative");
        }
    }

    private void setWidth(double width) throws Exception {
        if (width > 0) {
            this.width = width;
        } else {
            throw new Exception("Width cannot be zero or negative");
        }
    }

    private void setHeight(double height) throws Exception {
        if (length > 0) {
            this.height = height;
        } else {
            throw new Exception("Height cannot be zero or negative");
        }
    }

    public double calculateSurfaceArea() {
        return 2 * length * width + 2 * length * height + 2 * width * height;
    }

    public double calculateLateralSurfaceArea() {
        return 2 * length * height + 2 * width * height;
    }

    public double calculateVolume() {
        return length * width * height;
    }

    @Override
    public String toString() {
        return "Surface area - " + this.calculateSurfaceArea() + "\n" +
                "Lateral Surface Area - " + this.calculateLateralSurfaceArea() + "\n" +
                "Volume - " + this.calculateVolume();
    }
}