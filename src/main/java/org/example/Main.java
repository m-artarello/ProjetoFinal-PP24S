package org.example;

import org.example.entidades.factory.*;
import org.example.entidades.issue.Issue;

public class Main {
    public static void main(String[] args) {

        System.out.println("Criando issue do tipo Estória:");
        IssueFactory estoriaFactory = new EstoriaFactory();
        Issue estoria = estoriaFactory.createIssue("Desenvolver sistema de pagamentos", "Pendente", "A ideia desta issue é testar a implementação");
        estoria.imprimeIssue("");

        System.out.println("\nCriando issue do tipo Desenvolvimento:");
        IssueFactory desenvolvimentoFactory = new DesenvolvimentoFactory();
        Issue desenvolvimento1 = desenvolvimentoFactory.createIssue(
                "[Back-end] - Iniciar estruturação",
                "Pendente",
                "Iniciar a estruturação da implementação desta atividade"
        );
        desenvolvimento1.imprimeIssue("");

        System.out.println("\nCriando issue do tipo Teste:");
        IssueFactory testesFactory = new TestesFactory();
        Issue testes1 = testesFactory.createIssue(
                "[Testes] - Planejar casos de teste",
                "Pendente",
                "Iniciar o planejamento dos casos de teste"
        );
        testes1.imprimeIssue("");

        System.out.println("\nCriando issue do tipo Bug:");
        IssueFactory bugFactory = new BugFactory();
        Issue bugIssue = bugFactory.createIssue(
                "[Bug] - Falha ao escolher método de pagamento",
                "Pendente",
                "Ao escolher o método de pagamento é exibido um erro de código 500 no console do navegador."
        );
        bugIssue.imprimeIssue("");

        System.out.println("\nAdicionando tarefas na estória:");
        estoria.addTask(desenvolvimento1);
        estoria.addTask(testes1);
        estoria.addTask(bugIssue);
        estoria.imprimeIssue("");

        System.out.println("\nClonando issue de bug:");
        Issue bugIssue2 = bugIssue.clone();
        bugIssue2.imprimeIssue("");

        System.out.println("\nAlterando issue de bug clonada e adicionando à estória:");
        bugIssue2.setTitulo("[BUG] - Falha ao finalizar o pagamento");
        estoria.addTask(bugIssue2);
        estoria.imprimeIssue("");
    }
}