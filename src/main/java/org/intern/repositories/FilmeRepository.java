package org.intern.repositories;


import org.intern.models.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Long>{

	boolean existsByNome(String nome);

}
