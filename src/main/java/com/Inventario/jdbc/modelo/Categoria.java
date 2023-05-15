package com.Inventario.jdbc.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Categoria {
    private Integer id;
    private String nombre;

    private List<Producto> productos;

    public Categoria() {
    }

    public Categoria(String nombre) {
        this.nombre = nombre;
    }

    public Categoria(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
       return nombre.toUpperCase(Locale.ROOT);
    }

    public void agregar(Producto producto) {
        if (this.productos== null){
            this.productos= new ArrayList<>();
        }
        this.productos.add(producto);
    }
    public List<Producto>getProductos(){
        return this.productos;
    }


}
