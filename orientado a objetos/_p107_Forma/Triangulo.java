package _p107_Forma;

public class Triangulo extends Forma {
    double Base, Altura;

    public Triangulo(String color, double base, double altura) {
        super(color);
        Base = base;
        Altura = altura;
    }

    public double getBase() {
        return Base;
    }



    public void setBase(double base) {
        Base = base;
    }



    public double getAltura() {
        return Altura;
    }



    public void setAltura(double altura) {
        Altura = altura;
    }

    public double getArea(){
        return (Base*Altura)/2;
    }

    @Override
    public String toString() {
        return "Triangulo [" + super.toString() + "Base=" + Base + ", Altura=" + Altura + "]";
    }

}
