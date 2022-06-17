package br.com.ProjDengue.service;
import br.com.ProjDengue.model.Casos;
import br.com.ProjDengue.repository.CasosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CasosService {

    @Autowired
    private CasosRepository casosRepository;

    public void save(Casos casos) {
        casosRepository.save(casos);
    }

}