package br.com.ProjDengue.service;
import br.com.ProjDengue.repository.PessoaRepository;
import br.com.ProjDengue.model.Pessoa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public void sendPessoaRabbit(Pessoa pessoa){ pessoaRepository.save(pessoa); }

    public void save(Pessoa pessoa){
        pessoaRepository.save(pessoa);
    }

    public List<Pessoa> findAll(){
        return pessoaRepository.findAll();
    }

    public Optional<Pessoa> findById(String id){
        return pessoaRepository.findById(id);
    }

    public void delete(String id){
        pessoaRepository.deleteById(id);
    }

    public void deleteAll(){
        pessoaRepository.deleteAll();
    }
}