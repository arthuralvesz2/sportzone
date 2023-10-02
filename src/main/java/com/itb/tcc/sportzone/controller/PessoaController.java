package com.itb.tcc.sportzone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.tcc.sportzone.model.Pessoa;
import com.itb.tcc.sportzone.repository.PessoaRepository;

@Controller
@RequestMapping("/sportzone/pessoa")
public class PessoaController {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	// Carregar formulário de Cadastro
	@GetMapping("/novo-usuario")
	public String showFormCadatroPessoa(Pessoa pessoa, Model model) {
		
		model.addAttribute("pessoa", pessoa);
		
		return "sportzone/cadastro";
	}
	
	// Inserir a pessoa no banco de dados
	
	@PostMapping
	public String insertPessoa(Pessoa pessoa, Model model) {
		
		pessoa.setCodStatusPessoa(true);
		
		Pessoa pessoaDb = pessoaRepository.save(pessoa);
		
		return "redirect:/sportzone/login";
}
	// Página de sucesso do cadastro cliente
	
	@GetMapping
	public String showPagePessoaSucesso () {
		
		return "pessoa-sucesso";
	}
}