package br.com.ProjDengue.controller;
import br.com.ProjDengue.constant.Constant;
import br.com.ProjDengue.model.Casos;
import br.com.ProjDengue.service.CasosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class CasosController {

    @Autowired
    private CasosService casosService;

    @PostMapping(Constant.API_CASOS)
    public void save(@RequestBody Casos casos){
        casosService.sendCasosRabbit(casos);
        //casosService.save(casos);
    }

    @GetMapping(Constant.API_CASOS)
    public List<Casos> findAll(){
        return casosService.findAll();
    }

    @PutMapping(Constant.API_CASOS)
    public void update(@RequestBody Casos casos){
        casosService.save(casos);
    }

    @DeleteMapping(Constant.API_CASOS + "/{id}")
    public void delete(@PathVariable("id") String id){
        casosService.delete(id);
    }

    @GetMapping(Constant.API_CASOS + "/{id}")
    public Optional<Casos> findById(@PathVariable("id") String id){
        return casosService.findById(id);
    }
}