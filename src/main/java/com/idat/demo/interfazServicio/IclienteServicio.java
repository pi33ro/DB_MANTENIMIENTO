package com.idat.demo.interfazServicio;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.idat.demo.modelo.Cliente;

@Repository
public interface IclienteServicio {
	
	//LISTAR GUARDAR Y ELIMINAR
		public List<Cliente>listar();
		public Optional<Cliente>listarIdcliente(int d);
		public int save(Cliente p);
		public void delete(int idcliente);

}
