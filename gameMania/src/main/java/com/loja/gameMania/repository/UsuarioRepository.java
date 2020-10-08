package com.loja.gameMania.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loja.gameMania.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long>{

	public List<Usuario> findAllByEmailContainingIgnoreCase(String email);

}
