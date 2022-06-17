/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author HP
 */
public class Producto {
    private int codigo;
    private int lote; 
    private String Nombre;
    private String Descripcion;

    public Producto(int codigo, int lote, String Nombre, String Descripcion) {
        this.codigo = codigo;
        this.lote = lote;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", lote=" + lote + ", Nombre=" + Nombre + ", Descripcion=" + Descripcion + '}';
    }
    
    
    
    
}
