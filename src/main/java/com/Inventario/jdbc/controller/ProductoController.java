package com.Inventario.jdbc.controller;

import java.util.List;

import com.Inventario.jdbc.dao.ProductoDAO;
import com.Inventario.jdbc.factory.ConnectionFactory;
import com.Inventario.jdbc.modelo.Producto;


public class ProductoController {

    private ProductoDAO productoDao;
    
    public ProductoController() {
        var factory = new ConnectionFactory();
        this.productoDao = new ProductoDAO(factory.recuperaConexion());
    }

    public int modificar(String nombre, String descripcion, Integer cantidad, Integer id) {
        return productoDao.modificar(nombre, descripcion, cantidad, id);
    }

    public int eliminar(Integer id) {
        return productoDao.eliminar(id);
    }

    public List<Producto> listar() {
        return productoDao.listar();
    }

    public void guardar(Producto producto) {
        productoDao.guardar(producto);
    }

}
