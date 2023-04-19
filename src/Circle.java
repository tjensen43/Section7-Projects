public class Circle {
    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double circumference() {
        double circumference = (2 * (Math.PI) * (this.getRadius()));
        return circumference;
    }
    public double area() {
        double area = ((Math.PI) * (Math.pow(this.getRadius(), 2)));
        return area;
    }
}
