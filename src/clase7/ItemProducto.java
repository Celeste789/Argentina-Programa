package clase7;

import clase5.Producto;

public class ItemProducto {
    private clase5.Producto producto;
    private int cantidad;

    public ItemProducto(clase5.Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public clase5.Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double precioParcial(){
        double precioParcaial = producto.getPrecio() * cantidad;
        return precioParcaial;
    }
}
