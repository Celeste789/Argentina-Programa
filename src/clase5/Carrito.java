package clase5;

import java.sql.Array;

public class Carrito {
    private int id;
    private ItemProducto[] itemProductos;

    public Carrito() {
        this.itemProductos = new ItemProducto[3];
    }

    public ItemProducto[] getItemProductos() {
        return itemProductos;
    }

    public void setItemProductos(ItemProducto[] itemProductos) {
        this.itemProductos = itemProductos;
    }

    public int getId() {
        return id;
    }

    public double precioTotal(){
        double precioTotal = 0;
        for (ItemProducto itemProducto : itemProductos){
            precioTotal += itemProducto.getCantidad() * itemProducto.getProducto().getPrecio();
        }
        return precioTotal;
    }
}
