package com.idat.demo.controlador;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Control_Menu {
	
	@GetMapping("/menu")
	public String pagina1(Model model) {
		return "index";
	}
	

	
	
	
	@GetMapping("/vista_producto")
	public String pagina4(Model model) {
		return "vista_producto";
	}

}
