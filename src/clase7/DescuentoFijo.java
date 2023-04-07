package clase7;

public class DescuentoFijo extends Descuento{

    private double descuento;

    public DescuentoFijo(String tipo, double descuento) {
        super(tipo);
        this.descuento = descuento;
    }

    @Override
    public double calcularDescuento(Carrito carrito) {
        double precioFinal = carrito.precioTotal();
        if (getTipo() == "fijo"){
            precioFinal -= descuento;
        }
        return precioFinal;
    }
}
