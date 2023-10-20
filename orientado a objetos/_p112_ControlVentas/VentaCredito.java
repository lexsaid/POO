package _p112_ControlVentas;

public class VentaCredito extends Venta {
    
    private int Meses;
    private double Intereses;

    public VentaCredito(String articulo, double cantidad, double precio, int meses, double intereses) {
        super(articulo, cantidad, precio);
        this.Meses = meses;
        this.Intereses = intereses;
    }

    public int getMeses() {
        return Meses;
    }

    public void setMeses(int meses) {
        Meses = meses;
    }

    public double getIntereses() {
        return Intereses;
    }

    public void setIntereses(double intereses) {
        Intereses = intereses;
    }

    @Override
    public double getTotalVenta() {
        double total = Total + (Total * (Meses * Intereses / 100));
        return total;
    }

    @Override
    public String toString() {
        return "VentaCredito [" + super.toString() + " Meses=" + Meses + ", Intereses=" + Intereses + "%, TotalVenta= " + getTotalVenta() +"]";
    }

}
