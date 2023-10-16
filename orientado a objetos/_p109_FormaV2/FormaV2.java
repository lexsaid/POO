package _p109_FormaV2;

public abstract class FormaV2{
    
    String Color;
    boolean Relleno;
    
    public FormaV2() {
    }

    public FormaV2(String color, boolean relleno) {
        Color = color;
        Relleno = relleno;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public boolean isRelleno() {
        return Relleno;
    }

    public void setRelleno(boolean relleno) {
        Relleno = relleno;
    }

    public abstract double getArea();

    public abstract double getPerimetro();

    @Override
    public String toString() {
        return "FormaV2 [Color=" + Color + ", Relleno=" + Relleno + "]";
    }    
    
}
