package clase8;

import clase7.Carrito;

public class DescuentoPorcentaje extends Descuento {

    private int descuento;
    public DescuentoPorcentaje(String tipo) {
        super(tipo);
        this.descuento = descuento;
    }

    @Override
    public double calcularDescuento(Carrito carrito) {
        double precioFinal = carrito.precioTotal();
        if (getTipo() == "porcentual"){
            precioFinal -= carrito.porcentaje(precioFinal, descuento);
        }
        return precioFinal;
    }
}
