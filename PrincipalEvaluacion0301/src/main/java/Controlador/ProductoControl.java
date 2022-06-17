/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Producto;
import Servicio.ProductoServicio;
import java.util.List;

/**
 *
 * @author HP
 */
public class ProductoControl {
    private final ProductoServicio productoServicio=new ProductoServicio();
    
    public Producto crearProducto(String [] params){
        var producto= new Producto(Integer.parseInt(params[0]),Integer.parseInt(params[1]), params[2], params[3]);
        this.productoServicio.crear(producto);
        return producto;
    }
    
    public List<Producto> listarProducto(){
        return this.productoServicio.listar();
    }
    
}
