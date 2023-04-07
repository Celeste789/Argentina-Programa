package clase7;

import clase5.ItemProducto;

public class Carrito {
    private int id;
    private clase5.ItemProducto[] itemProductos;

    public Carrito() {
        this.itemProductos = new clase5.ItemProducto[3];
    }

    public clase5.ItemProducto[] getItemProductos() {
        return itemProductos;
    }

    public void setItemProductos(clase5.ItemProducto[] itemProductos) {
        this.itemProductos = itemProductos;
    }

    public int getId() {
        return id;
    }

    public double porcentaje(double valor, int porcentaje) {
        return porcentaje * valor / 100;
    }

    public double precioTotal() {
        double precioTotal = 0;
        for (ItemProducto itemProducto : itemProductos) {
            precioTotal += itemProducto.getCantidad() * itemProducto.getProducto().getPrecio();
        }
        return precioTotal;
    }
}