public class CircleDemo {
    public static void main(String[] args) {
        Circle emptyCircle = new Circle();
        Circle coolCircle = new Circle(23.5);

        System.out.println(coolCircle.getRadius());
        coolCircle.setRadius(33.5);
        System.out.println(coolCircle.getRadius());

        System.out.println(coolCircle.circumference());
        System.out.println(coolCircle.area());

    }
}
