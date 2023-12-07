package org.example.entidades.factory;

import org.example.entidades.enums.TipoIssue;
import org.example.entidades.issue.Estoria;
import org.example.entidades.issue.Issue;

public class EstoriaFactory implements IssueFactory{

    @Override
    public Issue createIssue(String titulo, String situacao, String detalhes) {
        return new Estoria(TipoIssue.ESTORIA, titulo, situacao, detalhes);

    }
}
