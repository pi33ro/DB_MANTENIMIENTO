package com.idat.demo.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.demo.interfaces.IProducto;
import com.idat.demo.interfazServicio.IproductoServicio;
import com.idat.demo.modelo.Producto;

@Service
public class ProductoServicio implements IproductoServicio {
	
	@Autowired
	IProducto data;
	@Override
	public List<Producto> listar() {
		return (List<Producto>)data.findAll();
	}

	@Override
	public Optional<Producto> listarId(int d) {
		return data.findById(d);
	}

	//entregar un valor numero "int" 0 sino grabo y 1 si grabo
	//data es funcion de crud repository lo guarda una variable persona
	//si persona es diferente a nulo sale 1
	@Override
	public int save(Producto p) {
		int res=0;	
		Producto producto=data.save(p);
		if(!producto.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);		
	}

}
