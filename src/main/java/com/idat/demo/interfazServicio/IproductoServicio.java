package com.idat.demo.interfazServicio;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.idat.demo.modelo.Producto;

@Repository
public interface IproductoServicio {
	
	//LISTAR GUARDAR Y ELIMINAR
		public List<Producto>listar();
		public Optional<Producto>listarId(int d);
		public int save(Producto p);
		public void delete(int id);

}
