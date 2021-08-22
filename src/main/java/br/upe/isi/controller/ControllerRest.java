package br.upe.isi.controller;

import br.upe.isi.classes.Aluno;
import br.upe.isi.classes.Disciplina;
import br.upe.isi.repository.AlunoRepository;
import br.upe.isi.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

//@RestController
public class ControllerRest {

    @Autowired
    private AlunoRepository alunoRepository;
    @Autowired
    private DisciplinaRepository disciplinaRepository;

    @PostMapping("/cadastra_disciplina")
    Disciplina disciplina(@RequestBody Disciplina disciplina){
        return disciplinaRepository.save(disciplina);
    }

    @PostMapping("/cadastra_aluno")
    Aluno aluno(@RequestBody Aluno aluno){
        return alunoRepository.save(aluno);
    }

    @GetMapping("/lista_alunos")
    List<Aluno> all(){
        return alunoRepository.findAll();
    }

    @DeleteMapping("/alunos/{id}")
    void deletaAluno(@PathVariable Integer id){
        alunoRepository.deleteById(id);
    }
}
