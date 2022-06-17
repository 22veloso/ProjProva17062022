package br.com.ProjDengue.controller;
import br.com.ProjDengue.constant.Constant;
import br.com.ProjDengue.model.Pessoa;
import br.com.ProjDengue.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping(Constant.API_PESSOA)
    public void save(@RequestBody Pessoa pessoa){
        pessoaService.sendPessoaRabbit(pessoa);
    }

    @GetMapping(Constant.API_PESSOA)
    public List<Pessoa> findAll(){
        return pessoaService.findAll();
    }

    @PutMapping(Constant.API_PESSOA)
    public void update(@RequestBody Pessoa pessoa){
        pessoaService.save(pessoa);
    }

    @DeleteMapping(Constant.API_PESSOA + "/{id}")
    public void delete(@PathVariable("id") String id){
        pessoaService.delete(id);
    }

    @GetMapping(Constant.API_PESSOA + "/{id}")
    public Optional<Pessoa> findById(@PathVariable("id") String id){
        return pessoaService.findById(id);
    }
}