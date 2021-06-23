package com.ucreativa.presupuesto;

public class Metas {
    private String nombre;
    private String estado;      //pendiente o hecho
    private String categoria;   //Lujo o Necesidad
    private int precio;

    public Metas(String nombre, String estado, String categoria, int precio) {
        this.nombre = nombre;
        this.estado = estado;
        this.categoria = categoria;
        this.precio = precio;
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }


    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
