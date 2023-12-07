package org.example.entidades;

public class BugFactory implements IssueFactory{

    @Override
    public Issue createIssue(String titulo, String situacao, String detalhes) {
        return new Bug(TipoIssue.BUG, titulo, situacao, detalhes);
    }
}
