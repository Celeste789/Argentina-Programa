package clase5;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Carrito {
   private ArrayList<ItemProducto> items;

   public Carrito(ArrayList<ItemProducto> items) {
      this.items = items;
   }

   public void agregarItem(ItemProducto item) {
      items.add(item);
   }

   public void quitarItem(ItemProducto item) {
      items.remove(item);
   }

   public double getTotal() {
      double total = 0;
      for (ItemProducto item : items) {
         total += item.getPrecioTotal();
      }
      return total;
   }
}
