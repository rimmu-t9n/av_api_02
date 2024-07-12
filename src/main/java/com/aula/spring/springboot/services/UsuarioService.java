package com.aula.spring.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aula.spring.exceptions.NaoEncontradoException;
import com.aula.spring.springboot.entities.Usuario;
import com.aula.spring.springboot.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	
	public List<Usuario> procurarTodos() {
		return repository.findAll();
	}
	public Usuario procurarPorId(Integer id) {
			return repository.findById(id).orElseThrow(() -> new NaoEncontradoException("ID INEXISTENTE! Usuário não encontrado."));
	}
	public String adicionarUsuario(Usuario usuario) {
		repository.save(usuario);
		return "Usuário adicionado com sucesso.";
	}
	public String editarUsuario(Integer id, Usuario usuario) {
		Usuario response = repository.findById(id).get();
		
		response.setNome(usuario.getNome());
		response.setEmail(usuario.getEmail());
		response.setSenha(usuario.getSenha());
		
		repository.save(response);
		return "Usuário editado com sucesso.";
	}
	public void excluirUsuario(Integer id) {
		Usuario response = repository.findById(id).get();
		repository.delete(response);
	}	
}