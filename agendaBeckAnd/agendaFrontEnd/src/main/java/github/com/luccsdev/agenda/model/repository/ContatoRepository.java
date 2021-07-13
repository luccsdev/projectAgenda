package github.com.luccsdev.agenda.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import github.com.luccsdev.agenda.model.entity.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Integer>{

}
