package br.com.ProjDengue.model;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Usuario extends Pessoa{

    public Usuario(){}

    public Usuario(String id, String nome){
        super();
    }
}

