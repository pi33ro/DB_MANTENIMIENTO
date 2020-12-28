package com.idat.demo.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.demo.interfaces.ICliente;
import com.idat.demo.interfazServicio.IclienteServicio;
import com.idat.demo.modelo.Cliente;

@Service
public class ClienteServicio implements IclienteServicio {

	@Autowired
	ICliente data;
	@Override
	public List<Cliente> listar() {
		return (List<Cliente>)data.findAll();
	}

	@Override
	public Optional<Cliente> listarIdcliente(int d) {
		return data.findById(d);
	}

	//entregar un valor numero "int" 0 sino grabo y 1 si grabo
	//data es funcion de crud repository lo guarda una variable persona
	//si persona es diferente a nulo sale 1
	@Override
	public int save(Cliente p) {
		int res=0;	
		Cliente cliente=data.save(p);
		if(!cliente.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int idcliente) {
		data.deleteById(idcliente);		
	}
}
