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

import com.idat.demo.interfazServicio.IclienteServicio;
import com.idat.demo.modelo.Cliente;

@Controller
@RequestMapping
public class ControladorCliente {
	
	@Autowired
	private IclienteServicio service;

	@GetMapping("/listarCliente")
	public String listar(Model model) {
		List<Cliente>clientes=service.listar();
		model.addAttribute("clientes",clientes);
		return "vista_cliente";
	}

	@GetMapping("/newCliente")
	public String agregar(Model model) {
		model.addAttribute("clientes",new Cliente());
		return "form_Cliente";
	}
	//POSTMAPPING VUANDO QUIERO ENVIAR VALORES
	@PostMapping("/saveCliente")
	public String save(Cliente p, Model model) {
		service.save(p);
		return "redirect:/listarCliente";
	}

	@GetMapping("/editarCliente/{idcliente}")
	public String editar(@PathVariable int idcliente, Model model) {
		Optional<Cliente> clientes = service.listarIdcliente(idcliente);
		model.addAttribute("clientes", clientes);
		return "form_Cliente";
	}

	@GetMapping("/eliminarCliente/{idcliente}")
	public String delete(Model model, @PathVariable int idcliente) {
		service.delete(idcliente);
		return "redirect:/listarCliente";
	}

}
