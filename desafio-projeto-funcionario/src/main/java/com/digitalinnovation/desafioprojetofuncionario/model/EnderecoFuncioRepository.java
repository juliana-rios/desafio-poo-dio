package com.digitalinnovation.desafioprojetofuncionario.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoFuncioRepository extends CrudRepository<EnderecoFuncio, String> {

}
