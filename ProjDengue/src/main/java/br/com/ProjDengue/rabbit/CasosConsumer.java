package br.com.ProjDengue.rabbit;
import br.com.ProjDengue.model.Casos;
import br.com.ProjDengue.service.CasosService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class CasosConsumer {

    @Autowired
    private CasosService casosService;

    @RabbitListener(queues = {"${queue.dengue.name}"})
    public void receive (@Payload Casos casos){
        System.out.println("Id: "+ casos.get_id() + "\nDescrição: " + casos.getDescricao() + "\nQuantidade: " + casos.getQuantidade() + "\nEndereco: " + casos.getEndereco() + "\nUsuario: " + casos.getUsuario());
        casosService.save(casos);
    }
}