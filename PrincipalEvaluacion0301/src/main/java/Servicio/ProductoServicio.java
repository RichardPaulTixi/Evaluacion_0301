/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class ProductoServicio implements IProductoServicio{
    
    private final List<Producto> productoList=new ArrayList<>();

    @Override
    public Producto crear(Producto producto) {
        this.productoList.add(producto);
        return producto;
    }

    @Override
    public List<Producto> listar() {
        return this.productoList;
    }
    
    
}
