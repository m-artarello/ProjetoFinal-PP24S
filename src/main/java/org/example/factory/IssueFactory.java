package org.example.factory;

import org.example.entidades.issue.Issue;

public interface IssueFactory {
    Issue createIssue(String titulo, String situacao, String detalhes);
}
