package br.com.ProjDengue.repository;
import br.com.ProjDengue.model.Cidade;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends MongoRepository<Cidade, String> {
}