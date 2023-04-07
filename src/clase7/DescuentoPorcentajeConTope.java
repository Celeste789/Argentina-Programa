package clase7;

public class DescuentoPorcentajeConTope extends DescuentoPorcentaje{

    private int tope;

    public DescuentoPorcentajeConTope(String tipo, int tope) {
        super(tipo);
        this.tope = tope;
    }

    public double descuentoConTope(Carrito carrito){
        double precioConDescuento = calcularDescuento(carrito);
        if (precioConDescuento > carrito.precioTotal() - tope){
            precioConDescuento = carrito.precioTotal() - tope;
        }
        return precioConDescuento;
    }
}
