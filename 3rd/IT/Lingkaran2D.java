package IT;

import java.awt.geom.Point2D;

public class Lingkaran2D {
    private Point2D center;
    private double radius;
    // private double pi = 3.14;

    public Lingkaran2D() {
        this.radius = 2;
        this.center = new Point2D.Double(0, 0);
    }

    public Lingkaran2D(double radius) {
        this.radius = radius;
        this.center = new Point2D.Double(0, 0);
    }

    public Lingkaran2D(double radius, double x, double y) {
        this.radius = radius;
        this.center = new Point2D.Double(x, y);
    }

    public double calculateArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double calculateCircumstance() {
        return 2 * this.radius * Math.PI;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double newRadVal) {
        this.radius = newRadVal;
    }

    public Point2D getCenter() {
        return this.center;
    }

    public void setCenter(double x, double y) {
        this.center = new Point2D.Double(x, y);
    }

    @Override
    public String toString() {
        return "Radius: " + radius + "\nCenter: " + center + "\nLuas lingkaran: " + calculateArea();
    }

    public double getDistance(Lingkaran2D ling2) {
        // (x2-x1)^2
        double X = Math.pow(ling2.center.getX() - center.getX(), 2);
        double Y = Math.pow(ling2.center.getY() - center.getY(), 2);
        return Math.sqrt(X + Y);
    }

    public boolean intersect(Lingkaran2D ling2) {
        if ((this.radius + ling2.radius) > getDistance(ling2)) {
            return true;
        }
        return false;
    }
}
