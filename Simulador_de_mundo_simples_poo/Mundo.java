import java.util.ArrayList;
import java.util.HashMap;

public class Mundo {
    private ArrayList<Pessoa> populacao;
    private HashMap<String, Lugar> lugares;
    private static int totalHabitantesCriados = 0;

    public Mundo() {
        this.populacao = new ArrayList<>();
        this.lugares = new HashMap<>();
    }

    public void criarPessoa(String nome) {
        Pessoa pessoa = new Pessoa(nome);
        populacao.add(pessoa);
        totalHabitantesCriados++;
    }

    public void simularDia() {
        for (Pessoa pessoa : populacao) {
            pessoa.passarTempo();
            pessoa.randomEvent();
            pessoa.exibirStatus();
        }
    }

    public void adicionarLugar(String nome, String descricao) {
        Lugar lugar = new Lugar(nome, descricao);
        lugares.put(nome, lugar);
    }

    public Lugar buscarLugar(String nome) {
        return lugares.get(nome);
    }

    public static int getTotalHabitantesCriados() {
        return totalHabitantesCriados;
    }
}