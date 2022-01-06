package com.segundoprojeto.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.segundoprojeto.model.Usuario;
import com.segundoprojeto.repository.UsuarioRepository;
import com.springboot.model.User;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@GetMapping("/{id}")
	public Usuario buscarUsuarioPorId(@PathVariable("id") Long id) {
		Optional<Usuario> UsuarioFind = this.usuarioRepository.findById(id);

		if (UsuarioFind.isPresent()) {
			return UsuarioFind.get();
		}

		return null;
	}
     
	@GetMapping("/listarUsuarios")
	public List<Usuario> listarUsuarios(){
		return usuarioRepository.findAll();
	}
	
	@PostMapping
	public Usuario cadastrarUsuario(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	
}
