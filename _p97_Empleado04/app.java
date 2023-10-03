package _p97_Empleado04;

import java.util.ArrayList;

public class app {
    public static void main(String[] args) {

        ArrayList<Empleado> empleados = new ArrayList<>();
        int suma=0, th=0, tm=0, tc=0, tnc=0;

        empleados.add(new Empleado("peje", 75, 'H', true));
        empleados.add(new Empleado("lex", 20, 'H', false));
        empleados.add(new Empleado("adrian", 19, 'H', false));
        empleados.add(new Empleado("liz", 22, 'M', false));
    
        for (Empleado empleado : empleados) {
            System.out.println(empleado.toString());
        }

        for (int i=0; i<empleados.size(); i++){
            suma= suma+empleados.get(i).getEdad();
            
            if(empleados.get(i).getSexo()=='H') th++; else tm++;
            if(empleados.get(i).getCasado()) tc++; else tnc++;
        }

        System.out.println("promedio de edades: "+(suma/empleados.size()));
        System.out.println("Hombres: "+ th + " Mujeres: "+ tm);
        System.out.println("solteros: "+ tnc + " Casados: "+ tc);
        
    }
}
