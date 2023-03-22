package clase6;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio1Clase6Test {

    @org.junit.jupiter.api.Test
    void multiplicar() {
        assertEquals(240, Ejercicio1Clase6.multiplicar(80, 3));
    }

    @org.junit.jupiter.api.Test
    void dividirYSumar() {
        assertEquals(110, Ejercicio1Clase6.dividir(Ejercicio1Clase6.sumar(150,180),3));
    }

    @org.junit.jupiter.api.Test
    void multiplicarYRestar(){
        assertNotEquals(605, Ejercicio1Clase6.multiplicar(Ejercicio1Clase6.restar(90,50),15));
    }

    @org.junit.jupiter.api.Test
    void sumarYMultiplicar(){
        assertNotEquals(2700, Ejercicio1Clase6.multiplicar(Ejercicio1Clase6.sumar(70,40),25));
    }
}