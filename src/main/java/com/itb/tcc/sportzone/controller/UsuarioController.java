package com.itb.tcc.sportzone.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.tcc.sportzone.model.Usuario;
import com.itb.tcc.sportzone.repository.UsuarioRepository;


@Controller
@RequestMapping("/sportzone/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	
	
	// Carregar formulário de Cadastro
	@GetMapping("/novo-usuario")
	public String showFormCadatroUsuario(Usuario usuario, Model model) {
		
		model.addAttribute("usuario", usuario);
		
		return "sportzone/cadastro";
	}
	
	// Inserir Usuario no banco de dados
	
	@PostMapping("/add-usuario")
	public String insertUsuario(Usuario usuario, Model model) {
		
		usuario.setCodStatusUsuario(true);
		
		Usuario usuarioDb = usuarioRepository.save(usuario);
		
		return "redirect:/sportzone/usuario/login";
}
	// Página de sucesso do cadastro cliente
	
	@GetMapping("/login")
	public String showPageLgin () {
		return "sportzone/login";
	}
}