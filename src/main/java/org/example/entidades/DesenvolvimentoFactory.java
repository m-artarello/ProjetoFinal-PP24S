package org.example.entidades;

public class DesenvolvimentoFactory implements IssueFactory{

    @Override
    public Issue createIssue(String titulo, String situacao, String detalhes) {
        return new Desenvolvimento(TipoIssue.DESENVOLVIMENTO, titulo, situacao, detalhes);

    }
}
