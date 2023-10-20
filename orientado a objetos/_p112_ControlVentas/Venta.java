package _p112_ControlVentas;

public abstract class Venta {

    protected String Articulo;
    protected double Cantidad;
    protected double Precio; 
    protected double Total;
    
    public Venta(String articulo, double cantidad, double precio) {
        Articulo = articulo;
        Cantidad = cantidad;
        Precio = precio;
        Total = precio * cantidad;
    }

    public String getArticulo() {
        return Articulo;
    }

    public void setArticulo(String articulo) {
        Articulo = articulo;
    }

    public double getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double total) {
        Total = total;
    }

    public abstract double getTotalVenta();

    @Override
    public String toString() {
        return "Venta [Articulo=" + Articulo + ", Cantidad=" + Cantidad + ", Precio=" + Precio + ", Total=" + Total + "]";
    }

}
