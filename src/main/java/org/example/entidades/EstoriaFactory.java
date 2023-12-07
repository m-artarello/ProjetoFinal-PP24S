package org.example.entidades;

public class EstoriaFactory implements IssueFactory{

    @Override
    public Issue createIssue(String titulo, String situacao, String detalhes) {
        return new Estoria(TipoIssue.ESTORIA, titulo, situacao, detalhes);

    }
}
