package br.com.ProjDengue.controller;
import br.com.ProjDengue.service.EnderecoService;
import br.com.ProjDengue.constant.Constant;
import br.com.ProjDengue.model.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @PostMapping(Constant.API_ENDERECO)
    public void save(@RequestBody Endereco endereco){
        enderecoService.sendEnderecoRabbit(endereco);
    }

    @GetMapping(Constant.API_ENDERECO)
    public List<Endereco> findAll(){
        return enderecoService.findAll();
    }

    @PutMapping(Constant.API_ENDERECO)
    public void update(@RequestBody Endereco endereco){
        enderecoService.save(endereco);
    }

    @DeleteMapping(Constant.API_ENDERECO + "/{id}")
    public void delete(@PathVariable("id") String id){
        enderecoService.delete(id);
    }

    @GetMapping(Constant.API_ENDERECO + "/{id}")
    public Optional<Endereco> findById(@PathVariable("id") String id){
        return enderecoService.findById(id);
    }
}