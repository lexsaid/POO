package _p99_Rectangulo;

public class Rectangulo {

    float Largo, Ancho, Area, Perimetro;

    public Rectangulo(float largo, float ancho) {
        Largo = largo;
        Ancho = ancho;
    }

    public Rectangulo() {

    }

    public String toString(){
        return String.format("Largo= %.2f, Ancho= %.2f", Largo, Ancho);
    }

    public float getAncho(){
        return Ancho;
    } 

    public void setAncho(float ancho){
        Ancho = ancho;
    }

    public float getLargo(){
        return Largo;
    } 

    public void setLargo(float largo){
        Largo = largo;
    }

    public double getArea(){
        Area = Largo*Ancho;
        return Area;
    }

    public double getPerimetro(){
        Perimetro = (2*Ancho) + (2*Largo);
        return Perimetro;
    }
    
}
