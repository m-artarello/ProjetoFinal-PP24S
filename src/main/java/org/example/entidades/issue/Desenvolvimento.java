package org.example.entidades.issue;

import org.example.entidades.enums.TipoIssue;

public class Desenvolvimento extends Issue{
    public Desenvolvimento(TipoIssue tipoIssue, String titulo, String situacao, String detalhes) {
        super(tipoIssue, titulo, situacao, detalhes);
    }
}
