package com.idat.demo.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.idat.demo.interfazServicio.IproductoServicio;
import com.idat.demo.modelo.Producto;

@Controller
@RequestMapping
public class ControladorProducto {
	
	@Autowired
	private IproductoServicio service;

	@GetMapping("/listarProducto")
	public String listar(Model model) {
		List<Producto>productos=service.listar();
		model.addAttribute("productos",productos);
		return "vista_producto";
	}

	@GetMapping("/newProducto")
	public String agregar(Model model) {
		model.addAttribute("productos",new Producto());
		return "form_producto";
	}
	//POSTMAPPING VUANDO QUIERO ENVIAR VALORES
	@PostMapping("/saveProducto")
	public String save(Producto p, Model model) {
		service.save(p);
		return "redirect:/listarProducto";
	}

	@GetMapping("/editarProducto/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Producto> productos = service.listarId(id);
		model.addAttribute("productos", productos);
		return "form_producto";
	}

	@GetMapping("/eliminarProducto/{id}")
	public String delete(Model model, @PathVariable int id) {
		service.delete(id);
		return "redirect:/listarProducto";
	}

}
