package org.example.entidades.issue;

import org.example.entidades.enums.TipoIssue;

public class Bug extends Issue{

    public Bug(TipoIssue tipoIssue, String titulo, String situacao, String detalhes) {
        super(tipoIssue, titulo, situacao, detalhes);
    }
}
