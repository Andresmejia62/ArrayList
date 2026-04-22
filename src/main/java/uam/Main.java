package uam;

import uam.servicios.ProductoServicio;


public class Main {
    static void main() {
        ProductoServicio productos = new ProductoServicio();
        productos.agregarProducto("Cafe", 40, 3);
        productos. agregarProducto("Churro", 45, 2);

        System.out.println("Factura");
        System.out.println(productos.getProductos());
        System.out.println("Total a pagar " + productos.getMonto());
    }
}
