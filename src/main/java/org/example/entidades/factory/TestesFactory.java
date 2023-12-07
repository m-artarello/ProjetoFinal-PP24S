package org.example.entidades.factory;

import org.example.entidades.enums.TipoIssue;
import org.example.entidades.issue.Issue;
import org.example.entidades.issue.Teste;

public class TestesFactory implements IssueFactory{

    @Override
    public Issue createIssue(String titulo, String situacao, String detalhes) {
        return new Teste(TipoIssue.TESTE, titulo, situacao, detalhes);

    }
}
