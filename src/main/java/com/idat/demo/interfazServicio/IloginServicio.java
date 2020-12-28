package com.idat.demo.interfazServicio;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.idat.demo.modelo.Login;

@Repository
public interface IloginServicio {
	
	//LISTAR GUARDAR Y ELIMINAR
		public List<Login>listar();
		public Optional<Login>listarId(int d);
		public int save(Login p);
		public void delete(int id);

}
