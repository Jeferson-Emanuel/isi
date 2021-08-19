package br.upe.isi.repository;

import br.upe.isi.classes.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface at03Repository extends JpaRepository<Cadastro, Integer> {
}
//o repository extende a Jpa, e passamos o objeto, ou seja, a entidade e o id dele que é um Integer
