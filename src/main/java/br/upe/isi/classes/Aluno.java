package br.upe.isi.classes;

import javax.persistence.*;

@Entity
@Table(name = "aluno")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;
    private String email;
    private String naturalidade;
    @ManyToOne
    @JoinColumn(name="disciplina_id")
    private Disciplina disciplina;

    public Aluno() {
    }

    public Aluno(String nome, String email, String naturalidade, Disciplina disciplina) {
        this.nome = nome;
        this.email = email;
        this.naturalidade = naturalidade;
        this.disciplina = disciplina;
    }

    public Aluno(int id, String nome, String email, String naturalidade, Disciplina disciplina) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.naturalidade = naturalidade;
        this.disciplina = disciplina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}
