package br.com.ProjDengue.controller;
import br.com.ProjDengue.model.Usuario;
import br.com.ProjDengue.constant.Constant;
import br.com.ProjDengue.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping(Constant.API_USUARIO)
    public void save(@RequestBody Usuario usuario){
        usuarioService.sendUsuarioRabbit(usuario);
    }

    @GetMapping(Constant.API_USUARIO)
    public List<Usuario> findAll(){
        return usuarioService.findAll();
    }

    @PutMapping(Constant.API_USUARIO)
    public void update(@RequestBody Usuario usuario){
        usuarioService.save(usuario);
    }

    @DeleteMapping(Constant.API_USUARIO + "/{id}")
    public void delete(@PathVariable("id") String id){
        usuarioService.delete(id);
    }

    @GetMapping(Constant.API_USUARIO + "/{id}")
    public Optional<Usuario> findById(@PathVariable("id") String id){
        return usuarioService.findById(id);
    }
}