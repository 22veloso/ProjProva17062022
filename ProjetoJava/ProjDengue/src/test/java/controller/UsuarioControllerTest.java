package controller;

import br.com.ProjDengue.App;
import br.com.ProjDengue.model.Usuario;
import br.com.ProjDengue.service.UsuarioService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = App.class)
@WebAppConfiguration
public class UsuarioControllerTest {

    @Autowired
    private UsuarioService usuarioService;

    @Test
    public void save() throws Exception {

        long qtd = 200;

        usuarioService.deleteAll();

        for ( int i = 1 ; i <= qtd ; i++){
            usuarioService.sendUsuarioRabbit(new Usuario(String.valueOf(i), "teste"+ i));
        }

        Thread.sleep(5000);
        List<Usuario> lst = usuarioService.findAll();

        System.out.println("Qtd:" + lst.size());
        Assert.assertEquals(lst.size(), qtd);
    }

}