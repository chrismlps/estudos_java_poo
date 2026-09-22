import java.util.ArrayList;
import java.util.Random;

public class Pessoa {
    private static final int MAX_ATRIBUTO = 100;
    private static final Random gerador = new Random();

    private String nome;
    private int fome;
    private int saude;
    private int energia;
    private boolean vivo = true;

    public Pessoa(String nome) {
        this.nome = nome;
        this.energia = 100;
        this.saude = 100;
        this.fome = 0;
        this.vivo = true;
    }

    public void comer() {
        if (vivo && fome > 0) {
            fome = clamp(fome - 10);
            energia = clamp(energia + 5);
            saude = clamp(saude + 5);
        } else if (vivo) {
            System.out.println(nome + " não está com fome.");
        }
    }

    public void dormir() {
        if (vivo) {
            energia = clamp(energia + 30);
            fome = clamp(fome + 10);
            saude = clamp(saude + 5);
        }
    }

    public void passarTempo() {
        if (vivo) {
            fome = clamp(fome + 20);
            energia = clamp(energia - 15);
            saude = clamp(saude - 2);
            exaustao();
            morte();
        }
    }

    public void randomEvent() {
        if (!vivo) {
            return;
        }
        int event = gerador.nextInt(4);
        switch (event) {
            case 0:
                System.out.println(nome + " encontrou um amigo e ficou feliz!");
                saude = clamp(saude + 10);
                break;
            case 1:
                System.out.println(nome + " encontrou um alimento e comeu.");
                fome = clamp(fome - 10);
                break;
            case 2:
                System.out.println(nome + " encontrou um remédio e se curou.");
                saude = clamp(saude + 20);
                break;
            default:
                System.out.println(nome + " ficou doente.");
                saude = clamp(saude - 20);
                break;
        }
        morte();
    }

    private int clamp(int valor) {
        if (valor < 0) return 0;
        if (valor > MAX_ATRIBUTO) return MAX_ATRIBUTO;
        return valor;
    }

    public ArrayList<String> populacaoTotal() {
        ArrayList<String> pessoas = new ArrayList<>();
        pessoas.add("Nome: " + nome);
        pessoas.add("Fome: " + fome);
        pessoas.add("Saúde: " + saude);
        pessoas.add("Energia: " + energia);
        return pessoas;
    }

    public String getNome() {
        return nome;
    }

    public int getFome() {
        return fome;
    }

    public int getSaude() {
        return saude;
    }

    public int getEnergia() {
        return energia;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void exibirStatus() {
        if (!vivo) {
            System.out.println(nome + " está morto.");
            return;
        }
        System.out.println("Nome: " + nome);
        System.out.println("Fome: " + fome);
        System.out.println("Saúde: " + saude);
        System.out.println("Energia: " + energia);
    }

    public void exaustao() {
        if (vivo && energia <= 0) {
            saude = clamp(saude - 40);
            System.out.println(nome + " está cansado e perdeu saúde.");
        }
    }

    public void morte() {
        if (saude <= 0) {
            System.out.println(nome + " morreu.");
            this.vivo = false;
        }
    }

}