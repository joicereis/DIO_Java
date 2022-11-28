package one.digitalinnovation.fourprojects.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import one.digitalinnovation.fourprojects.model.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}