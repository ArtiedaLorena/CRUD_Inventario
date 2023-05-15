package com.Inventario.jdbc.controller;

import com.Inventario.jdbc.dao.CategoriaDAO;
import com.Inventario.jdbc.factory.ConnectionFactory;
import com.Inventario.jdbc.modelo.Categoria;

import java.util.ArrayList;
import java.util.List;

public class CategoriaController {
    private CategoriaDAO categoriaDAO;

    public  CategoriaController (){
        var factory = new ConnectionFactory();
        this.categoriaDAO = new CategoriaDAO (factory.recuperaConexion());
    }

	public List<Categoria> listar() {

		return categoriaDAO.listar();
	}

    public List<Categoria> cargaReporte() {
        return this.categoriaDAO.listarConProductos();
    }

}
