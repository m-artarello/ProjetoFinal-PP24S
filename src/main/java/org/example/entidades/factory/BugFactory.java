package org.example.entidades.factory;

import org.example.entidades.enums.TipoIssue;
import org.example.entidades.issue.Bug;
import org.example.entidades.issue.Issue;

public class BugFactory implements IssueFactory{

    @Override
    public Issue createIssue(String titulo, String situacao, String detalhes) {
        return new Bug(TipoIssue.BUG, titulo, situacao, detalhes);
    }
}
