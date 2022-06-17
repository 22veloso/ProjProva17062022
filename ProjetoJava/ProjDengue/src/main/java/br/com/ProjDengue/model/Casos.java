package br.com.ProjDengue.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.io.Serializable;

@Document
public class Casos implements Serializable {

    @Id
    private String _id;
    private String descricao;
    private String quantidade;
    private String endereco;
    private String usuario;

    public Casos(){}

    public Casos(String _id, String descricao, String quantidade, String endereco, String usuario){
        this._id = _id;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.endereco = endereco;
        this.usuario = usuario;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getQuantidade() { return quantidade; }

    public void setQuantidade(String quantidade) { this.quantidade = quantidade; }

    public String getEndereco() { return endereco; }

    public void setEndereco(String endereco) { this.endereco = endereco; }

    public String getUsuario() { return usuario; }

    public void setUsuario(String usuario) { this.usuario = usuario; }
}