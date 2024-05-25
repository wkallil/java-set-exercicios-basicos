package pesquisaSetListaDeTarefas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoTarefas {
    private Set<Tarefa> tarefaSet;

    public ConjuntoTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    System.out.println("A Tarefe " + t.getDescricao() + " foi removida");
                    break;
                }
            }
            if (tarefaParaRemover != null) {
                tarefaSet.remove(tarefaParaRemover);
            } else {
                throw new RuntimeException("Tarefa não encontrada");
            }
        } else {
            throw new RuntimeException("O conjunto está vazio");
        }
    }

    public void exibirTarefas() {
        System.out.println(tarefaSet);
    }

    public int contarTarefas() {
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.isConclusao()) {
                    tarefasConcluidas.add(t);
                }
            }
            if (tarefasConcluidas.isEmpty()) {
                System.out.println("Você não tem tarefas concluídas");
            }
            return tarefasConcluidas;
        } else {
            throw new RuntimeException("O conjunto está vazio");
        }
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (!t.isConclusao()) {
                    tarefasPendentes.add(t);
                }
            }
            if (tarefasPendentes.isEmpty()) {
                System.out.println("Você não tem tarefas pendentes");
            }
            return tarefasPendentes;
        } else {
            throw new RuntimeException("O conjunto está vazio");
        }
    }

    public void marcarTarefaConcluida(String descricao) {
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setConclusao(true);
                    System.out.println("A tarefa " + t.getDescricao() + " foi marcada como concluída!");
                    break;
                }
            }
        } else {
            throw new RuntimeException("O conjunto está vazio");
        }
    }

    public void marcarTarefaPendente(String descricao) {
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setConclusao(false);
                    System.out.println("A tarefa " + t.getDescricao() + " foi marcada como pendente!");
                    break;
                }
            }
        } else {
            throw new RuntimeException("O conjunto está vazio");
        }
    }

    public void limparConjuntoTarefas() {
        Set<Tarefa> conjuntoParaEsvaziasTarefas = new HashSet<>(tarefaSet);
        tarefaSet.removeAll(conjuntoParaEsvaziasTarefas);
    }


}
