package _p105_PuntoTriangulo;

public class Punto {
    
    int X, Y;

    public Punto() {
        
    }

    public Punto(int x, int y) {
        X = x;
        Y = y;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public double getDistancia(Punto punto){
        double Distancia = Math.sqrt((Math.pow(X - punto.X, 2)) + (Math.pow(Y - punto.Y, 2)));
        return Distancia;
    }

    @Override
    public String toString() {
        return "Punto [X=" + X + ", Y=" + Y + "]";
    }

}
