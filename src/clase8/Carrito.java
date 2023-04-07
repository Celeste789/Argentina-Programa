package clase8;

import clase5.ItemProducto;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private int id;
    private List<ItemProducto> itemProductos;

    public Carrito() {
        this.itemProductos = new ArrayList<>();
    }

    public List<ItemProducto> getItemProductos() {
        return itemProductos;
    }

    public void setItemProductos(List<ItemProducto> itemProductos) {
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