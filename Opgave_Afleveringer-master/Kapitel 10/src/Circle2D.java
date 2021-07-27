public class Circle2D {

    public double x, y, radius;

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    } //constructor med opdateret variabler

    public double getX() { return x; } //sætter x

    public double getY() { return y; } //sætter y

    public double getRadius() { return radius; } //sætter radius

    Circle2D circle = new Circle2D(0,0,1);

    public double getArea(){
        return Math.PI * (radius * 2);
    }
}