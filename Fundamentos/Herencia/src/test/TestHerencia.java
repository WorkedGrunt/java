package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Javier", 5000.0);
        System.out.println(empleado1);
        
        var fecha = new Date();
        Cliente cliente1 = new Cliente("Jaime", 'M', 26, "Miguel Nieto 335", fecha, true);
        System.out.println(cliente1);
    }
    
}
