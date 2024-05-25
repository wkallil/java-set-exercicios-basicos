package ordenacaoSetListaDeAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(long matricula, String nome, double media) {
        alunoSet.add(new Aluno(matricula, nome, media));
    }

    public void removerAluno(long matricula) {
        Aluno alunoParaRemover = null;
        if (!alunoSet.isEmpty()) {
            for (Aluno a : alunoSet) {
                if (a.getMatricula() == matricula) {
                    alunoParaRemover = a;
                    break;
                }
            } alunoSet.remove(alunoParaRemover);
        } else {
            throw new RuntimeException("O conjunto está vazio");
        }

        if (alunoParaRemover == null) {
            System.out.println("Matrícula não encontrado");
        }
    }

    public void exibirAlunos(){
        System.out.println(alunoSet);
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparardorPorNota());
        alunosPorNota.addAll(alunoSet);
        return alunosPorNota;
    }

}
