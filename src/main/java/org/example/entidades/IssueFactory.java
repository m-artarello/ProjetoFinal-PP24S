package org.example.entidades;

public interface IssueFactory {
    Issue createIssue(String titulo, String situacao, String detalhes);
}
