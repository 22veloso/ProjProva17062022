package controller;
import br.com.ProjDengue.App;
import br.com.ProjDengue.model.Endereco;
import br.com.ProjDengue.service.EnderecoService;
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
public class EnderecoControllerTest {

    @Autowired
    private EnderecoService enderecoService;

    @Test
    public void save() throws Exception {

        long qtd = 200;

        enderecoService.deleteAll();

        for ( int i = 1 ; i <= qtd ; i++){
            enderecoService.sendEnderecoRabbit(new Endereco(String.valueOf(i), "teste"+i, "", "", "", ""));
        }

        Thread.sleep(5000);
        List<Endereco> lst = enderecoService.findAll();

        System.out.println("Qtd:" + lst.size());
        Assert.assertEquals(lst.size(), qtd);
        }

}