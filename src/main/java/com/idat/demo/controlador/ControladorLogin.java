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

import com.idat.demo.interfazServicio.IloginServicio;
import com.idat.demo.modelo.Login;

@Controller
@RequestMapping
public class ControladorLogin {
	
	@Autowired
	private IloginServicio service;

	@GetMapping("/listarLogin")
	public String listar(Model model) {
		List<Login>logins=service.listar();
		model.addAttribute("logins",logins);
		return "vista_login";
	}

	@GetMapping("/newLogin")
	public String agregar(Model model) {
		model.addAttribute("logins",new Login());
		return "form_login";
	}
	//POSTMAPPING VUANDO QUIERO ENVIAR VALORES
	@PostMapping("/saveLogin")
	public String save(Login p, Model model) {
		service.save(p);
		return "redirect:/listarLogin";
	}

	@GetMapping("/editarLogin/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Login> logins = service.listarId(id);
		model.addAttribute("logins", logins);
		return "form_login";
	}

	@GetMapping("/eliminarLogin/{id}")
	public String delete(Model model, @PathVariable int id) {
		service.delete(id);
		return "redirect:/listarLogin";
	}

}
