package clase8;

import clase7.Carrito;
import clase8.excepciones.CarritoPrecio0Exception;
import clase8.excepciones.DescuentoNegativoException;

public class DescuentoFijo extends Descuento {

    private double descuento;

    public DescuentoFijo(String tipo, double descuento) {
        super(tipo);
        this.descuento = descuento;
    }

    @Override
    public double calcularDescuento(Carrito carrito) throws DescuentoNegativoException, CarritoPrecio0Exception {
        double precioFinal = carrito.precioTotal();
        if (getTipo() == "fijo"){
            if (precioFinal == 0){
                throw new CarritoPrecio0Exception("No se puede aplicar un descuento a precio 0");
            } else {
                if (precioFinal - descuento <= 0){
                    throw new DescuentoNegativoException("El precio no puede ser negativo");
                }
            }
            precioFinal -= descuento;
        }
        return precioFinal;
    }
}
