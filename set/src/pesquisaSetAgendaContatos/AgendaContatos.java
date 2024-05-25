package pesquisaSetAgendaContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> agendaSet;

    public AgendaContatos() {
        this.agendaSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numeroTelefone) {
        agendaSet.add(new Contato(nome, numeroTelefone));
    }

    public void exibirContatos() {
        if (!agendaSet.isEmpty()) {
            System.out.println(agendaSet);
        } else {
            throw new RuntimeException("O conjunto está vazio");
        }
    }

    public Set<Contato> pesquisaPorNome(String nome) {
        Set<Contato> contatosEncontrados = new HashSet<>();
        if (!agendaSet.isEmpty()) {
            for (Contato c : agendaSet) {
                if (c.getNome().startsWith(nome)) {
                    contatosEncontrados.add(c);
                }
            }
            return contatosEncontrados;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public Contato atualizarNumeroContato(String nome, int novoNumeroTelefone) {
        Contato contatoAtualizado = null;
        if (!agendaSet.isEmpty()) {
            for (Contato c : agendaSet) {
                if (c.getNome().equalsIgnoreCase(nome)) {
                    c.setNumeroTelefone(novoNumeroTelefone);
                    contatoAtualizado = c;
                    break;
                }
            }
            return contatoAtualizado;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

}
