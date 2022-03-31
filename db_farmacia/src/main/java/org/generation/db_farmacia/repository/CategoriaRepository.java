package org.generation.db_farmacia.repository;

import java.util.List;

import org.generation.db_farmacia.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	public List<Categoria> findAllBySetorContainingIgnoreCase (String setor);
}
