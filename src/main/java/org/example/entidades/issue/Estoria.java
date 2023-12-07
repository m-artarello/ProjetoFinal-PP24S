package org.example.entidades.issue;
import org.example.entidades.enums.TipoIssue;

import java.util.ArrayList;
import java.util.List;

public class Estoria extends Issue{
    private List<Issue> tarefas;

    public Estoria(TipoIssue tipoIssue, String titulo, String situacao, String detalhes) {
        super(tipoIssue, titulo, situacao, detalhes);
        tarefas = new ArrayList<>();
    }

    @Override
    public void addTask(Issue issue) {
        tarefas.add(issue);
    }

    @Override
    public void delTask(Issue issue) {
        tarefas.remove(issue);
    }

    @Override
    public void imprimeIssue(String ident) {
        ident += "-";
        System.out.println(ident + " " +this.getTitulo() + " | " + this.getSituacao());

        if(tarefas == null){
            return;
        } else {
            for (Issue tarefa : tarefas){
                tarefa.imprimeIssue(ident);
            }
        }

    }

}
