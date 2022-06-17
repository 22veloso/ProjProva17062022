package br.com.ProjDengue.service;

import br.com.ProjDengue.repository.EnderecoRepository;
import br.com.ProjDengue.model.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public void sendEnderecoRabbit(Endereco endereco) {
        enderecoRepository.save(endereco);
    }

    public void save(Endereco endereco) {
        enderecoRepository.save(endereco);
    }

    public List<Endereco> findAll() {
        return enderecoRepository.findAll();
    }

    public Optional<Endereco> findById(String id) {
        return enderecoRepository.findById(id);
    }

    public void delete(String id) {
        enderecoRepository.deleteById(id);
    }

    public void deleteAll() {
        enderecoRepository.deleteAll();
    }
}