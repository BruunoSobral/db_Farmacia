package org.generation.db_farmacia.repository;

import java.util.List;

import org.generation.db_farmacia.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{ //Extende da classe produto e Long primitivo
	public List<Produto> findAllByNomeContainingIgnoreCase (String nome); //Vai buscar todos nomes ignorando se for letra maiuscula ou minuscula
}
