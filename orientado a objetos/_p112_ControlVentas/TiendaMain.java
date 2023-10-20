package _p112_ControlVentas;

import static java.lang.System.out;

public class TiendaMain {
    
    public static void main(String[] args) {
        
        //aqui creamos la tienda
        System.out.println("Reporte de clientes sin ventas : ");
        Tienda Latienda = new Tienda("Abarrotes la Victoria", "Lex Said", "Calle Victoria #223");

        //aqui creamos a los clientes
        Cliente c1 = new Cliente("calderon", "Donato guerra", "calderon@gmail.com");
        Cliente c2 = new Cliente("perez", "san fernando", "a@gmail.com");
        Cliente c3 = new Cliente("pablo", "el bordo", "pablo@gmail.com");
        Cliente c4 = new Cliente("onicua", "tacoaleche", "tyron@gmail.com");

        //aqui agregamos a los clientes en la tienda
        Latienda.agregarCliente(c1);
        Latienda.agregarCliente(c2);
        Latienda.agregarCliente(c3);
        Latienda.agregarCliente(c4);
        out.println(Latienda);

        out.println(" ");
        out.println(c1);
        out.println(c2);
        out.println(c3);
        out.println(c4);

        Latienda.getClientes().get(0).agregarVenta(new VentaContado("martillo", 10, 60.50, 10, "pepsi"));;
        Latienda.getClientes().get(0).agregarVenta(new VentaCredito("pala", 2, 1170.55, 3, 10));
        
        Latienda.getClientes().get(1).agregarVenta(new VentaCredito("clavo", 2.5, 160.34, 2, 20));
        Latienda.getClientes().get(1).agregarVenta(new VentaCredito("cinta de ailar", 5, 71.34, 6, 20));
        Latienda.getClientes().get(1).agregarVenta(new VentaContado("pinzas", 10, 650.33, 20, "coca"));;
        
        Latienda.getClientes().get(2).agregarVenta(new VentaContado("thiner", 50, 65, 10, "aerosol y mascarilla"));;
        out.println(" ");
        System.out.println("\nReporte de ventas de los clientes : ");
        out.println(Latienda+"\n");
        Latienda.reporte();

    }

}
