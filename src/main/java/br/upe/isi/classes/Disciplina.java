package br.upe.isi.classes;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "disciplina")
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;
    private String professor;
    @OneToMany(mappedBy = "disciplina")
    private List<Aluno> aluno;

    public Disciplina() {
    }

    public Disciplina(String nome, String professor, List<Aluno> aluno) {
        this.nome = nome;
        this.professor = professor;
        this.aluno = aluno;
    }

    public Disciplina(int id, String nome, String professor, List<Aluno> aluno) {
        this.id = id;
        this.nome = nome;
        this.professor = professor;
        this.aluno = aluno;
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

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public List<Aluno> getAluno() {
        return aluno;
    }

    public void setAluno(List<Aluno> aluno) {
        this.aluno = aluno;
    }
}
