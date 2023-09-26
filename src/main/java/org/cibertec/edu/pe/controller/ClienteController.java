package org.cibertec.edu.pe.controller;

import java.util.List;

import org.cibertec.edu.pe.entity.Cliente;
import org.cibertec.edu.pe.interfacesService.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClienteController {

	@Autowired
	private IClienteService servicio;
	
	@GetMapping("/listar")
	public String Listar(Model m) {
		List<Cliente> lista = servicio.Listado();
		m.addAttribute("clientes", lista);
		return "listar";
	}
	
	@GetMapping("/nuevo")
	public String agregar(Model m) {
		m.addAttribute("cliente", new Cliente());
		return "form";		//form.html
	}
	
	@GetMapping("/salvar")
	public String salvar(Cliente c, Model m) {
		servicio.Grabar(c);
		return "redirect:/listar";
	}
}
