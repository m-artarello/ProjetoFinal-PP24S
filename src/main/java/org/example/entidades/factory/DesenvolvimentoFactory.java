package org.example.entidades.factory;

import org.example.entidades.enums.TipoIssue;
import org.example.entidades.issue.Desenvolvimento;
import org.example.entidades.issue.Issue;

public class DesenvolvimentoFactory implements IssueFactory{

    @Override
    public Issue createIssue(String titulo, String situacao, String detalhes) {
        return new Desenvolvimento(TipoIssue.DESENVOLVIMENTO, titulo, situacao, detalhes);

    }
}
