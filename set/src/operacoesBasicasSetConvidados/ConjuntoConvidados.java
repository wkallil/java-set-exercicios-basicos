package operacoesBasicasSetConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoConjunto;

    public ConjuntoConvidados() {
        this.convidadoConjunto = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoConjunto.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        if (!convidadoConjunto.isEmpty()) {
            for (Convidado c : convidadoConjunto) {
                if (c.getCodigoConvite() == codigoConvite) {
                    convidadoParaRemover = c;
                    break;
                }
            } convidadoConjunto.remove(convidadoParaRemover);
        } else {
            throw new RuntimeException("O conjunto está vazio");
        }
    }

    public int contarConvidados(){
        return convidadoConjunto.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoConjunto);
    }
}
