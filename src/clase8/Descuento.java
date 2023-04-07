package clase8;

import clase7.Carrito;
import clase8.excepciones.CarritoPrecio0Exception;
import clase8.excepciones.DescuentoNegativoException;

public abstract class Descuento {
    private String tipo;

    public Descuento(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public abstract double calcularDescuento(Carrito carrito) throws DescuentoNegativoException, CarritoPrecio0Exception;
}
