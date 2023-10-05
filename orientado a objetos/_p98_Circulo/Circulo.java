package _p98_Circulo;

public class Circulo {
    
    double Radio, Area, Circunferencia;

    public Circulo(double radio) {
        Radio = radio;
    }   

    public Circulo() {
        
    }

    public double getRadio(){
        return Radio;
    }

    public void setRadio(double radio){
        Radio = radio;
    }

    public double getArea(){
        Area = Math.PI * Math.pow(Radio, 2);
        return Area;
    }

    public double getCircunferencia(){
        Circunferencia = 2 * Math.PI * Radio;
        return Circunferencia;
    }

    public String toString(){
        return String.format("ciculo= %.2f",Radio);
    }

}
