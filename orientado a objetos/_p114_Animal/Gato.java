package _p114_Animal;

//una clase implementa una interfaz, al hacerle debe sobrecargar todos sus metodos

public class Gato implements Animal {
    
    public void dormir(){
        System.out.println("el gato duerme en la caja");
    }

    public void sonido(){
        System.out.println("el gato maulla");
    }

    public void comer(){
        System.out.println("el gato come whyskas");
    }

}
