package application.repository;

import org.springframework.data.repository.CrudRepository;

import application.domain.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Integer>{

}
