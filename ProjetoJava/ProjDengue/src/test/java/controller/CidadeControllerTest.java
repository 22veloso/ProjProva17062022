package controller;

import br.com.ProjDengue.App;
import br.com.ProjDengue.model.Cidade;
import br.com.ProjDengue.service.CidadeService;
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
public class CidadeControllerTest {

    @Autowired
    private CidadeService cidadeService;

    @Test
    public void save() throws Exception {

        long qtd = 200;

        cidadeService.deleteAll();

        for ( int i = 1 ; i <= qtd ; i++){
            cidadeService.sendCidadeRabbit(new Cidade(String.valueOf(i), "teste"+i));
        }

        Thread.sleep(5000);
        List<Cidade> lst = cidadeService.findAll();

        System.out.println("Qtd:" + lst.size());
        Assert.assertEquals(lst.size(), qtd);
    }

}