package org.example.entidades.issue;

import org.example.entidades.enums.TipoIssue;

public abstract class Issue implements Cloneable{ // Cloneable é uma classe pronta que permite implementar o Prototype
    private TipoIssue tipoIssue;
    private String titulo;
    private String situacao;
    private String detalhes;

    public Issue(TipoIssue tipoIssue, String titulo, String situacao, String detalhes) {
        this.tipoIssue = tipoIssue;
        this.titulo = titulo;
        this.situacao = situacao;
        this.detalhes = detalhes;
    }

    protected Issue() {
    }

    public void imprimeIssue(String ident) {
        ident += "-";
        System.out.println(ident + " " + this.titulo + " | " + this.situacao);
    }

    public void addTask(Issue issue) {
        throw new UnsupportedOperationException();
    }

    public void delTask(Issue issue) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Issue clone() { // Método que vai possibilitar o clone / prototype
        try {
            Issue clone = (Issue) super.clone();
            clone.setTitulo("CLONE - " + clone.getTitulo());
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public TipoIssue getTipoIssue() {
        return tipoIssue;
    }

    public void setTipoIssue(TipoIssue tipoIssue) {
        this.tipoIssue = tipoIssue;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }
}
