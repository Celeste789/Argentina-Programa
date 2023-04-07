package clase8;

import clase7.Carrito;
import clase8.excepciones.CarritoPrecio0Exception;

public class DescuentoPorcentaje extends Descuento {

    private int descuento;
    public DescuentoPorcentaje(String tipo) {
        super(tipo);
        this.descuento = descuento;
    }

    @Override
    public double calcularDescuento(Carrito carrito) throws CarritoPrecio0Exception {
        double precioFinal = carrito.precioTotal();
        if (getTipo() == "porcentual"){
            if (precioFinal == 0){
                throw new CarritoPrecio0Exception("No se puede aplicar descuento a precio 0");
            }
            precioFinal -= carrito.porcentaje(precioFinal, descuento);
        }
        return precioFinal;
    }
}
