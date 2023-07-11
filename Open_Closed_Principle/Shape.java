package Open_Closed_Principle;

public class Shape {
    public int Rectangle = 1;
    public int Square;

    public String RectangleFormula() {
        return String.valueOf(Rectangle);
    }

    public String SquareFormulae() {
        return String.valueOf(Square);
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.RectangleFormula();
    }
}
