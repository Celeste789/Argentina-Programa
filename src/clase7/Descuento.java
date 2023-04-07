package clase7;

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
