package br.com.ProjDengue.rabbit;
import br.com.ProjDengue.model.Casos;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CasosProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private Queue queue;

    public void send(Casos casos){
        rabbitTemplate.convertAndSend(this.queue.getName(), casos);
    }
}