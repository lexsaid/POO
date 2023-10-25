package _p115_Telefono;

public class Telefono implements Conecta, Gps, Radio {

    public void ObtenereCoordenadas(){
        System.out.println("Obteniendo coordenadas ...");
    }

    public void IniciarRadio(){
        System.out.println("iniciando radio ...");
    }
    
    public void DetenerRadio(){
        System.out.println("deteniendo radio ...");
    }
    
    public void Wifi(){
        System.out.println("agarrando señal ...");
    }
    
    public void Bluethoot(){
        System.out.println("iniciando bluethoot ...");
    }

}
