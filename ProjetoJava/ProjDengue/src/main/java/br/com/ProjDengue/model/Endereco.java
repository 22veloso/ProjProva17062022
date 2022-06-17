package br.com.ProjDengue.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.io.Serializable;

@Document
public class Endereco implements Serializable {

    @Id
    private String _id;
    private String logradouro;
    private String bairro;
    private String numero;
    private String cep;
    private String cidade;

    public Endereco(){}

    public Endereco(String _id, String logradouro, String bairro, String numero, String cep, String cidade){
        this._id = _id;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.numero =numero;
        this.cep = cep;
        this.cidade = cidade;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() { return cidade; }

    public void setCidade(String cidade) { this.cidade = cidade; }
}