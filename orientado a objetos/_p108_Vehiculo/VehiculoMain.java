import static java.lang.System.out;

import java.util.ArrayList;

public class VehiculoMain {
    
    public static void main(String[] args) {
        
        Compacto V1 = new Compacto("CP0100010122", "Ford,", 2023, 125345.22, 4, 2);
        out.println(V1);
        Compacto V2 = new Compacto("CP1000145555", "Nissan,", 2010, 54500.33, 6, 4);
        out.println(V2);

        Camioneta V3 = new Camioneta("CA104014544", "Dina", 2008, 234567.15, 450, 4);
        out.println(V3);
        Camioneta V4 = new Camioneta("CA774814599", "Hongyan", 2023, 934577.98, 1200, 6);
        out.println(V4);

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(V1);
        vehiculos.add(V2);
        vehiculos.add(V3);
        vehiculos.add(V4);

        double Total = 0;
        for (Vehiculo vehiculo : vehiculos) {
            Total += vehiculo.getPrecio();
            out.println("el precio de los vehiculos es: " + vehiculo.getPrecio());
        }
        out.println("el total es:" + Total);

    
    }

}
