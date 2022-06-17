package br.com.ProjDengue.service;
import br.com.ProjDengue.model.Casos;
import br.com.ProjDengue.rabbit.CasosProducer;
import br.com.ProjDengue.repository.CasosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CasosService {

    @Autowired
    private CasosRepository casosRepository;

    @Autowired
    private CasosProducer casosProducer;

    public void sendCasosRabbit(Casos casos) {
        casosProducer.send(casos);
    }

    public void save(Casos casos) {
        casosRepository.save(casos);
    }

    public List<Casos> findAll() {
        return casosRepository.findAll();
    }

    public Optional<Casos> findById(String id) {
        return casosRepository.findById(id);
    }

    public void delete(String id) { casosRepository.deleteById(id);}

    public void deleteAll() {
        casosRepository.deleteAll();
    }
}