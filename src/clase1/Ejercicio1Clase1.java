package clase1;

public class Ejercicio1Clase1 {

    public static void ejercicio1A(int a, int b){
        while (a <= b){
            System.out.println(a);
            a++;
        }
    }

    public static void ejercicio1B(int a, int b){
        while (a <= b){
            if (a % 2 == 0){
                System.out.println(a);
            }
            a++;
        }
    }

    public static void ejercicio1C(int a, int b, int interruptor) {
        while (a <= b) {
            if (interruptor % 2 == 0 && a % 2 == 0) {
                System.out.println(a);
            } else if (interruptor % 2 != 0 && a % 2 != 0)
                System.out.println(a);
            a++;
        }
    }

    public static void ejercicio1D(int a, int b){
        for (int i = b; i >= a; i--){
            System.out.println(i);
        }
    }
}
