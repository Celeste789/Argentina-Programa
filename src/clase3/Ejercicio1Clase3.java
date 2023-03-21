package clase3;

import java.util.ArrayList;
public class Ejercicio1Clase3{

    public static int repeticiones(String palabra, char letra){
        int resultado = 0;
        for (int i = 0; i < palabra.length(); i++){
            if (palabra.charAt(i) == letra){
                resultado++;
            }
        }
        return resultado;
    }
//-----------------------------------------------------------------------------------
    public static int posicionMaximaHasta(ArrayList<Integer> lista, int hasta){
        int posicion = hasta;
        int maximo = lista.get(hasta);
        for (int i = 0; i <= hasta; i++){
            if (maximo < lista.get(i)){
                posicion = i;
            }
        }
        return posicion;
    }

    public static int posicionMaximaDesde(ArrayList<Integer> lista, int desde){
        int posicion = desde;
        int maximo = lista.get(desde);
        for (int i = desde; i < lista.size(); i++){
            if (maximo < lista.get(i)){
                posicion = i;
            }
        }
        return posicion;
    }

    public static ArrayList<Integer> cambiar(ArrayList<Integer> lista, int i, int j){
        int aux = lista.get(i);
        lista.set(i, lista.get(j));
        lista.set(j, aux);
        return lista;
    }

    public static ArrayList<Integer> ordenamiento(ArrayList<Integer> lista, boolean descendete){
        if (descendete){
           for (int i = lista.size() - 1; i >= 0; i--){
               int posicionMaxima = posicionMaximaHasta(lista, i);
               lista = cambiar(lista, i, posicionMaxima);
           }
        }
        else{
            for (int i = 0; i < lista.size(); i++){
                int posicionMaxima = posicionMaximaDesde(lista, i);
                lista = cambiar(lista, i, posicionMaxima);
            }
        }
        return lista;
    }

    public static int sumaDesde(ArrayList<Integer> lista, int parametro){
        int resultado = 0;
        for (int i : lista){
            if (i >= parametro){
                resultado += i;
            }
        }
        return resultado;
    }

}


