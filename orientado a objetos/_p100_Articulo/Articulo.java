package _p100_Articulo;

public class Articulo {

    String Id, Desc;
    int Cantidad;
    double Precio, Total;

    public Articulo(String id, String desc, int cantidad, double precio) {
        Id = id;
        Desc = desc;
        Cantidad = cantidad;
        Precio = precio;
    }

    public String toString(){
        return String.format("Articulo: [ID: %s, Desc: %s, Cant= %d, PrecioUnit= %.2f]", Id, Desc, Cantidad, Precio);
    }

    public String getId() {
        return Id;
    }

    public String getDesc() {
        return Desc;
    }


    public int getCant() {
        return Cantidad;
    }
    public void setPrecioUnit(double precio) {
        Precio = precio;
    }


    public Double getPrecioUnit() {
        return Precio;
    }
    public void setCant(int cantidad){
        Cantidad = cantidad;
    }


    public Double getTotal() {
        return Total= Precio * Cantidad;
    }
    
}
