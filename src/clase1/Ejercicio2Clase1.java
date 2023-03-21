package clase1;

import java.util.Scanner;

public class Ejercicio2Clase1 {
    public void ingresosAltos(){
        boolean ingresosALtos = false;
        Scanner leer = new Scanner(System.in);
        System.out.println("Coloque sus ingresos mensuales");
        float ingresosMensuales = leer.nextFloat();
        System.out.println("Ingrese cantidad de vehiculos");
        int cantidadDeVehiculos = leer.nextInt();
        System.out.println("Ingrese su cantidad de inmuebles");
        int cantidadInmuebles = leer.nextInt();
        System.out.println("Si tiene una embarcación, una aeronave de lujo, o es titular de activos en una sociedad, escriba true. Caso contrario, escriba false");
        boolean capacidadEconomica = leer.nextBoolean();
        if (ingresosMensuales >= 489083 && cantidadDeVehiculos >= 3 && cantidadInmuebles >= 3 && capacidadEconomica == true){
            ingresosALtos = true;
        }
        if (ingresosALtos){
            System.out.println("Usted entra en la categoria de ingresos altos");
        } else {
            System.out.println("Usted no entra en la categoria de ingresos altos");
        }
    }
}
