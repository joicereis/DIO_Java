package one.digitalinnovation.fourprojects.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import one.digitalinnovation.fourprojects.model.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}