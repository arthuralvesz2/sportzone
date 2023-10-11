package com.itb.tcc.sportzone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.itb.tcc.sportzone.model.Usuario;
import com.itb.tcc.sportzone.repository.UsuarioRepository;

@Controller
@RequestMapping("/sportzone/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@GetMapping("/cadastro")
	public String showFormCadatroUsuario(Usuario usuario, Model model) {
		
		model.addAttribute("usuario", usuario);
		
		return "sportzone/cadastro";
	}
	
	@PostMapping("/add-usuario")
	public String insertUsuario(Usuario usuario, Model model) {
		
		usuario.setCodStatusUsuario(true);
		
		Usuario usuarioDb = usuarioRepository.save(usuario);
		
		return "redirect:/sportzone/usuario/login";
    }
    
    @GetMapping("/login")
    public String showFormLogin(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "sportzone/login";
    }
    
    @PostMapping("/verificar-login")
    public String verifyLogin(@ModelAttribute Usuario usuario, Model model) {

        Usuario usuarioDb = usuarioRepository.findByEmailAndSenha(usuario.getEmail(), usuario.getSenha());
        
        if (usuarioDb != null) {
            return "redirect:/sportzone/usuario/index";
        }
        
        else {
            model.addAttribute("usuario", usuario);
            model.addAttribute("mensagemErro", "Email ou senha inválidos");
            return "sportzone/login";
        }
    }

    @GetMapping("/index")
    public String showIndex(Model model) {
        return "sportzone/index";
    }
    
    @GetMapping("/atualizar-produtos")
    public String showAualizarProdutos(Model model) {
        return "sportzone/atualizar-produtos";
    }
    
    @GetMapping("/autenticacao")
    public String showAutenticação(Model model) {
        return "sportzone/autenticacao";
    }
    
    @GetMapping("/autenticacao2")
    public String showAutenticação2(Model model) {
        return "sportzone/autenticacao2";
    }
    
    @GetMapping("/cadastrar-produtos")
    public String showCadastrarProdutos(Model model) {
        return "sportzone/cadastrar-produtos";
    }
    
    @GetMapping("/cartoes")
    public String showCartões(Model model) {
        return "sportzone/cartoes";
    }
    
    @GetMapping("/cartoes-adicionado")
    public String showCartõesAdicionado(Model model) {
        return "sportzone/cartoes-adicionado";
    }
    
    @GetMapping("/cartoes-editado")
    public String showCartõesEditado(Model model) {
        return "sportzone/cartoes-editado";
    }
    
    @GetMapping("/cartoes-editar")
    public String showCartõesEditar(Model model) {
        return "sportzone/cartoes-editar";
    }   
    
    @GetMapping("/cartoes-novo")
    public String showCartõesNovo(Model model) {
        return "sportzone/cartoes-novo";
    }
    
    @GetMapping("/dados-pessoais")
    public String showDadosPessoais(Model model) {
        return "sportzone/dados-pessoais";
    }
    
    @GetMapping("/dados-pessoais2")
    public String showDadosPessoais2(Model model) {
        return "sportzone/dados-pessoais2";
    }
    
    @GetMapping("/enderecos")
    public String showEndereços(Model model) {
        return "sportzone/enderecos";
    }
    
    @GetMapping("/enderecos-adicionado")
    public String showEndereçosAdicionado(Model model) {
        return "sportzone/enderecos-adicionado";
    }
    
    @GetMapping("/enderecos-editado")
    public String showEndereçosEditado(Model model) {
        return "sportzone/enderecos-editado";
    }
    
    @GetMapping("/enderecos-editar")
    public String showEndereçosEditar(Model model) {
        return "sportzone/enderecos-editar";
    }
    
    @GetMapping("/enderecos-novo")
    public String showEndereçosNovo(Model model) {
        return "sportzone/enderecos-novo";
    }
    
    @GetMapping("/faleconosco")
    public String showFaleConosco(Model model) {
        return "sportzone/faleconosco";
    }
    
    @GetMapping("/index - adm")
    public String showIndexAdm(Model model) {
        return "sportzone/index - adm";
    }
    
    @GetMapping("/index - nologin")
    public String showIndexNoLogin(Model model) {
        return "sportzone/index - nologin";
    }
    
    @GetMapping("/meus-pedidos")
    public String showMeusPedidos(Model model) {
        return "sportzone/meus-pedidos";
    }
    
    @GetMapping("/mudar-senha")
    public String showMudarSenha(Model model) {
        return "sportzone/mudar-senha";
    }
    
    @GetMapping("/mudar-senha-confirmar")
    public String showMudarSenhaConfirmar(Model model) {
        return "sportzone/mudar-senha-confirmar";
    }
    
    @GetMapping("/ver-detalhes")
    public String showVerDetalhes(Model model) {
        return "sportzone/ver-detalhes";
    }
}
