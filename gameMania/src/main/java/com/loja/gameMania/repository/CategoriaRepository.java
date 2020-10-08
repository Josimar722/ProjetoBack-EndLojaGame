package com.loja.gameMania.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loja.gameMania.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	public List <Categoria> findAllByTipoContainingIgnoreCase(String tipo);

	

}
