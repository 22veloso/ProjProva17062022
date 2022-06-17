package br.com.ProjDengue.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.io.Serializable;

@Document
public class Cidade implements Serializable {

    @Id
    private String _id;
    private String nomeCidade;

    public Cidade(){}

    public Cidade(String _id, String nomeCidade){
        this._id = _id;
        this.nomeCidade = nomeCidade;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }
}