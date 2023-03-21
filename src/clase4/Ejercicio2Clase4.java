package clase4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Ejercicio2Clase4 {
    public static int sumatoria(String ruta) throws IOException {
        int suma = 0;
        for (String linea : Files.readAllLines(Paths.get(ruta))){
            int lineaANumero = Integer.parseInt(linea);
            suma += lineaANumero;
        }
        return suma;
    }


    public static void main(String[] args) throws IOException {
        int suma = Ejercicio2Clase4.sumatoria("C:\\Users\\Celeste\\Desktop\\Argentina programa\\Argentina Programa\\src\\clase4\\texto");
        System.out.println(suma);
    }

}
