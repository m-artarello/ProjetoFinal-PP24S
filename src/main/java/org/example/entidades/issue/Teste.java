package org.example.entidades.issue;

import org.example.entidades.enums.TipoIssue;

public class Teste extends Issue{
    public Teste(TipoIssue tipoIssue, String titulo, String situacao, String detalhes) {
        super(tipoIssue, titulo, situacao, detalhes);
    }
}
