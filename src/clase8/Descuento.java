package clase8;

import clase7.Carrito;

public abstract class Descuento {
    private String tipo;

    public Descuento(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public abstract double calcularDescuento(Carrito carrito);
}
