package _p103_ClienteFactura;

public class ClientefacturaMain {

    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente();
        Factura factura1 = new Factura();
        cliente1.setId("FIFA-0010");
        cliente1.setNombre("Messi");
        cliente1.setDescuento(0);
        factura1.setId(1);
        factura1.setMonto(3500);
        factura1.setCliente(cliente1);
        System.out.println(factura1);

        Factura factura2 = new Factura(10, new Cliente("bicho3000", "CR7 siu", 200), 1000);
        System.out.println("Id 1: "+factura2.getCliente().getId());
        System.out.println("Nombre: "+factura2.getCliente().getNombre());
        System.out.println("Descuento: "+factura2.getCliente().getDescuento());
        System.out.println("Id 2: "+factura2.getId());
        System.out.println("Monto: "+factura2.getMonto());
        System.out.println("Con Descuento: "+factura2.getMontocondescuento());
    }
    
}
