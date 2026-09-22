import java.util.HashMap;

public class Lugar {
    private String nome;
    private String descricao;
    HashMap<String, Object> lugares = new HashMap<>();

    public Lugar(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    

}