package clase4;

import clase3.Ejercicio1Clase3;
import clase3.Ejercicio2Clase3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Ejercicio3Clase4 {

    public static void decodficarATexto(boolean decodificado, int salto, String rutaEntrada, String rutaSalida) throws IOException {
        for (String linea : Files.readAllLines(Paths.get(rutaEntrada))) {
            FileWriter writer = new FileWriter(rutaSalida);
            String lineaAImprimir;
            if (decodificado) {
                lineaAImprimir = Ejercicio2Clase3.decodificar(linea, salto);
            } else {
                lineaAImprimir = Ejercicio2Clase3.codificar(linea, salto);
            }
            Files.write(Path.of(rutaSalida), lineaAImprimir.getBytes(), new StandardOpenOption[]{StandardOpenOption.APPEND});
        }
    }

    public static void main(String[] args) throws IOException {
        decodficarATexto(true, 1, "C:\\Users\\Celeste\\Desktop\\Argentina programa\\Argentina Programa\\src\\clase4\\textoEntrada", "C:\\Users\\Celeste\\Desktop\\Argentina programa\\Argentina Programa\\src\\clase4\\textoSalida");
    }
}
