package com.idat.demo.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.idat.demo.modelo.Producto;

public interface IProducto extends CrudRepository <Producto, Integer> {

}
