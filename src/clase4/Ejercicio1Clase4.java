package clase4;

import clase3.Ejercicio1Clase3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1Clase4 {
    //El item a está en Ejercicio1Clase3

    public static ArrayList<Integer> ordenamientoScanner(boolean ascendete){
        Scanner scanner = new Scanner(System.in);
        int primerParametro = scanner.nextInt();
        int segundoParametro = scanner.nextInt();
        int tercerParametro = scanner.nextInt();
        ArrayList<Integer> resultado = new ArrayList<>();
        resultado.add(primerParametro);
        resultado.add(segundoParametro);
        resultado.add(tercerParametro);
        resultado = Ejercicio1Clase3.ordenamiento(resultado, ascendete);
        return resultado;
    }

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> lista = new ArrayList<>();
        boolean ascendente = false;
        if (lista.size() > 0){
            lista = Ejercicio1Clase3.ordenamiento(lista, ascendente);
        } else {
            lista = ordenamientoScanner(ascendente);
        }

        System.out.println(lista);

    }
}
