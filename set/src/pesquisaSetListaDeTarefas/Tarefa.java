package pesquisaSetListaDeTarefas;

import java.util.Objects;

public class Tarefa {
    private String descricao;
    private boolean conclusao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.conclusao = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConclusao() {
        return conclusao;
    }

    public void setConclusao(boolean conclusao) {
        this.conclusao = conclusao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return Objects.equals(getDescricao(), tarefa.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getDescricao());
    }

    @Override
    public String toString() {
        return "descricao=" + descricao +
                ", conclusao=" + conclusao +
                " | ";
    }
}
