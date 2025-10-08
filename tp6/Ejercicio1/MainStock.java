package resolucion.tp6.Ejercicio1;
import java.util.ArrayList;
import resolucion.tp6.Ejercicio1.Producto;

public class MainStock {
     public static void main(String[] args) {
        Inventario inv = new Inventario();

        inv.agregarProducto(new Producto("001", "Leche", 800, 50, CategoriaProducto.ALIMENTOS));
        inv.agregarProducto(new Producto("002", "Celular", 2500, 20, CategoriaProducto.ELECTRONICA));
        inv.agregarProducto(new Producto("003", "Remera", 1500, 80, CategoriaProducto.ROPA));
        inv.agregarProducto(new Producto("004", "Sillón", 5000, 10, CategoriaProducto.HOGAR));
        inv.agregarProducto(new Producto("005", "Galletas", 300, 200, CategoriaProducto.ALIMENTOS));

   
        inv.listarProductos();

        System.out.println("\nProducto id 001:");
        Producto productoPorId = inv.buscarProductoPorId("001");
        productoPorId.mostrarInfo(); 

       System.out.println("\nProductos filtrados");
       ArrayList<Producto> productosPorCategoria = inv.filtrarPorCategoria(CategoriaProducto.ROPA); 
       for(Producto p : productosPorCategoria) { 
           p.mostrarInfo();
        }
       
        System.out.println("\nEliminado producto id 005");
        inv.eliminarProducto("005"); 
        System.out.println("\nInventario actualizado: ");
        inv.listarProductos();
        
        
        inv.actualizarStock("003", 120);
        System.out.println("\nTotal stock disponible: " + inv.obtenerTotalStock());

        System.out.println("\nProducto con mayor Stock: ");
        inv.productoConMayorStock().mostrarInfo();

        System.out.println("\nProductos entre $1000 y $3000");
        ArrayList<Producto> productosFiltradosPorPrecio = inv.filtrarProductosPorPrecio(1000, 3000); 
        for (Producto p : productosFiltradosPorPrecio) { 
        p.mostrarInfo(); 
}
        System.out.println("\nCategorías disponibles:");
        inv.mostrarCategoriasDisponibles();
    }
}

