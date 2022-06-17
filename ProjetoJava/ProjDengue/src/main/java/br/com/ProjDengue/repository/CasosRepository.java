package br.com.ProjDengue.repository;
import br.com.ProjDengue.model.Casos;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CasosRepository extends MongoRepository<Casos, String> {
}