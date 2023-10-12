package _p107_Forma;

public abstract class Forma {

    String Color;

    public Forma() {
    }

    public Forma(String color) {
        Color = color;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return "Forma [Color=" + Color + "]";
    }
    
}
