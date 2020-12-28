package com.idat.demo.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.idat.demo.modelo.Cliente;

public interface ICliente extends CrudRepository<Cliente,Integer> {

}
