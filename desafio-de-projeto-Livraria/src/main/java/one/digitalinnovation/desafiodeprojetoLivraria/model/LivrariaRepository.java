package one.digitalinnovation.desafiodeprojetoLivraria.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivrariaRepository extends CrudRepository<Livraria, Long> {

}
