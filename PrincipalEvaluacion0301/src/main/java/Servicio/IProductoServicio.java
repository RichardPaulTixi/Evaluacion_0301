/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import Modelo.Producto;
import java.util.List;

/**
 *
 * @author HP
 */
public interface IProductoServicio {
    
    public Producto crear(Producto producto);
    public List<Producto> listar();
    
}
