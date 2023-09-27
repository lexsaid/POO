// Muestra un arreglo y lo eleva al cuadrado usando funciones

public class _p86_ArregloMostrar {

    public static void Mostrar(int[] a) {
        for(int i=0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }

    public static void Cuadrado(int [] a) {
        for(int i=0; i < a.length; i++)
            a[i] = a[i] * a[i];
    }

    public static void main(String[] args) {

        int[] arre1 = {2, 4, 6, 8, 3, 5, 7};
        int[] arre2 = {1, 3, 5, 7, 8, 10, 12, 13, 15};

        System.out.println("\nElementos del arreglo1 ");
        Mostrar(arre1);
        System.out.println("\nElementos del Arreglo 1 al Cuadrado");
        Cuadrado(arre1); 
        Mostrar(arre1);

        System.out.println("\nElementos del arreglo 2 ");
        Mostrar(arre2);
        System.out.println("\nElementos del Arreglo 2 al Cuadrado");
        Cuadrado(arre2); 
        Mostrar(arre2);

    }

}