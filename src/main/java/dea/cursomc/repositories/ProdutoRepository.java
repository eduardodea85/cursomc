package dea.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dea.cursomc.domain.Produto;

//@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {	
	
	
}
