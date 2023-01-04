package core.basesyntax;

public class Square extends Figure implements AreaCalculator, Figuredraw {
    private double side;

    public Square(double side,String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure:Square " + "Color:" + getColor() + " " + "Area: " + getArea());
    }
}