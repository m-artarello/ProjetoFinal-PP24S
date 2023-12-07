package org.example.entidades;

enum TipoIssue {

        BUG("Bug"),
        TESTE("Testes"),
        DESENVOLVIMENTO("Desenvolvimento"),
        ESTORIA("Estória");

        private String descricao;

        TipoIssue(String descricao) {
            this.descricao = descricao;
        }

        public String getDescricao() {
            return descricao;
        }
}
