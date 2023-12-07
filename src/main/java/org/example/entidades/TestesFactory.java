package org.example.entidades;

public class TestesFactory implements IssueFactory{

    @Override
    public Issue createIssue(String titulo, String situacao, String detalhes) {
        return new Teste(TipoIssue.TESTE, titulo, situacao, detalhes);

    }
}
