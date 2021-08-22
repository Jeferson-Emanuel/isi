package br.upe.isi.controller;

import br.upe.isi.classes.Aluno;
import br.upe.isi.classes.Cadastro;
import br.upe.isi.classes.Disciplina;
import br.upe.isi.repository.AlunoRepository;
import br.upe.isi.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

//import antlr.collections.List;

@Controller
@RequestMapping("")
public class at03Controller {

//    @Autowired /*usa ela para dizer que ela é gerenciada pelo spring*/
//    private at03Repository repositorio;

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private DisciplinaRepository disciplinaRepository;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String getHome() {
        return "index";/*index é responsável por encaminhar a requisição para a tela inicial para cadastro e listagem*/
    }

    //    @RequestMapping(value = "/cadastro", method = RequestMethod.GET)
//    public String getCadastro() {
//        return "cadastro";/*cadastro é responsável por encaminhar a requisição para a tela do formulário de cadastro de objetos*/
//    }
//
//    @RequestMapping(value = "/cadastro", method = RequestMethod.POST)
//    public String postCadastro(Cadastro cadastro) {
//
//        repositorio.save(cadastro);/*chama a service, no caso o repositorio, para salvar esse objeto cadastro no banco de dados*/
//
//        return "redirect:/cadastro";/*e redireciona para a tela de cadastro novamente para um novo cadastro*/
//    }

    @RequestMapping(value = "/aluno", method = RequestMethod.GET)
    public String getAluno() {
        return "aluno";
    }

    @RequestMapping(value = "/aluno", method = RequestMethod.POST)
    public String postAluno(Aluno aluno) {

        alunoRepository.save(aluno);/*chama a service, no caso o repositorio, para salvar esse objeto cadastro no banco de dados*/

        return "redirect:/aluno";/*e redireciona para a tela de cadastro novamente para um novo cadastro*/
    }

    @RequestMapping(value = "/disciplina", method = RequestMethod.GET)
    public String getDisciplina() {
        return "disciplina";
    }

    @RequestMapping(value = "/disciplina", method = RequestMethod.POST)
    public String postDisciplina(Disciplina disciplina) {

        disciplinaRepository.save(disciplina);/*chama a service, no caso o repositorio, para salvar esse objeto cadastro no banco de dados*/

        return "redirect:/disciplina";
    }

//    @RequestMapping(value = "/lista", method = RequestMethod.GET)
//    public ModelAndView listaCadastros() {
//        ModelAndView mv = new ModelAndView("lista");/*instancia ela, passa o nome do template (nesse caso, "lista")*/
//        mv.addObject("cadastros", repositorio.findAll());/*passa o nome do objeto, passa o objeto que vai pegar todos os objetos que estão lá no banco, ou seja, todos os cadastros*/
//        return mv;/*e retorna esses objetos para tela de listagem*/
//    }

    @RequestMapping(value = "/lista", method = RequestMethod.GET)
    public ModelAndView listaAlunos() {
        ModelAndView mv = new ModelAndView("lista");/*instancia ela, passa o nome do template (nesse caso, "lista")*/
        mv.addObject("alunos", alunoRepository.findAll());/*passa o nome do objeto, passa o objeto que vai pegar todos os objetos que estão lá no banco, ou seja, todos os cadastros*/
        return mv;/*e retorna esses objetos para tela de listagem*/
    }

    //    @RequestMapping(value = "/lista/{id}", method = RequestMethod.GET)
//    public String deletaCadastro(@PathVariable Integer id) {
//        Cadastro dc = repositorio.findById(id).orElseThrow();
//        repositorio.delete(dc);
//        return "redirect:/lista";
//    }

    @RequestMapping(value = "/lista/{id}", method = RequestMethod.GET)
    public String deletaAluno(@PathVariable Integer id) {
        Aluno deletaAluno = alunoRepository.findById(id).orElseThrow();
        alunoRepository.delete(deletaAluno);
        return "redirect:/lista";
    }

//    @RequestMapping(value = "/edita", method = RequestMethod.GET)
//    public String getedita() {
//        return "editar";
//    }
//
//    @RequestMapping(value = "/edita", method = RequestMethod.POST)
//    public String editar(Cadastro cadastro) {
//
//        try {
//            List<Cadastro> dc = repositorio.findAll();
//            Cadastro bdcadastro = null;
//            for (Cadastro a : dc) {
//                if (cadastro.getEmail().equals(a.getEmail())) {
//                    bdcadastro = a;
//                    break;
//                }
//            }
//            cadastro.setId(bdcadastro.getId());
//            repositorio.save(cadastro);
//            return "redirect:/lista";
//        } catch (Exception e) {
//            return "telaerro";
//        }
//
//    }

}

