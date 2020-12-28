package com.idat.demo.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.demo.interfaces.ILogin;
import com.idat.demo.interfazServicio.IloginServicio;
import com.idat.demo.modelo.Login;

@Service
public class LoginServicio implements IloginServicio{
	
	@Autowired
	ILogin data;
	@Override
	public List<Login> listar() {
		return (List<Login>)data.findAll();
	}

	@Override
	public Optional<Login> listarId(int d) {
		return data.findById(d);
	}

	//entregar un valor numero "int" 0 sino grabo y 1 si grabo
	//data es funcion de crud repository lo guarda una variable persona
	//si persona es diferente a nulo sale 1
	@Override
	public int save(Login p) {
		int res=0;	
		Login login=data.save(p);
		if(!login.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);		
	}

}
