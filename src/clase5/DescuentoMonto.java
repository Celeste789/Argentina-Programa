package clase5;

public class DescuentoMonto extends Descuento{
    private double monto;

    public DescuentoMonto(String descripcion, double monto) {
        super(descripcion);
        this.monto = monto;
    }


}
