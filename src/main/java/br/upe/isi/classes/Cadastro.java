package br.upe.isi.classes;

import javax.persistence.*;

@Entity
@Table(name = "cadastro")
public class Cadastro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;
    private String email;
    private String contato;
    private String cidade;

    public Cadastro() {
    }

    public Cadastro(int id, String nome, String email, String contato, String cidade) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.contato = contato;
        this.cidade = cidade;
    }

    public Cadastro(String nome, String email, String contato, String cidade) {
        this.nome = nome;
        this.email = email;
        this.contato = contato;
        this.cidade = cidade;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Cadastro{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", contato='" + contato + '\'' +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}
