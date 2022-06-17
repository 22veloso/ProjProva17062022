package br.com.ProjDengue.service;
import br.com.ProjDengue.model.Usuario;
import br.com.ProjDengue.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public void sendUsuarioRabbit(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    public void save(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    public List<Usuario> findAll() { return usuarioRepository.findAll(); }

    public Optional<Usuario> findById(String id) {
        return usuarioRepository.findById(id);
    }

    public void delete(String id) {
        usuarioRepository.deleteById(id);
    }

    public void deleteAll() {
        usuarioRepository.deleteAll();
    }
}