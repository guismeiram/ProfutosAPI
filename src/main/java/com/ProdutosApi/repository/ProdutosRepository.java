package com.ProdutosApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProdutosApi.models.Produto;

public interface ProdutosRepository extends JpaRepository<Produto, Long>{
	
	Produto findById(long id);
}
