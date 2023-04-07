package clase8;

import clase7.Carrito;
import clase8.excepciones.CarritoPrecio0Exception;

public class DescuentoPorcentajeConTope extends DescuentoPorcentaje {

    private int tope;

    public DescuentoPorcentajeConTope(String tipo, int tope) {
        super(tipo);
        this.tope = tope;
    }

    public double descuentoConTope(Carrito carrito) throws CarritoPrecio0Exception {
        double precioConDescuento = calcularDescuento(carrito);
        if (precioConDescuento > carrito.precioTotal() - tope){
            precioConDescuento = carrito.precioTotal() - tope;
        }
        return precioConDescuento;
    }
}
