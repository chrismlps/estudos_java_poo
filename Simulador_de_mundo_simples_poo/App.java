public class App {
    public static void main(String[] args) {
        Mundo mundo = new Mundo();
        mundo.criarPessoa("Alice");
        mundo.criarPessoa("Bob");
        mundo.criarPessoa("Lucas");

        System.out.println("Total de habitantes criados: " + Mundo.getTotalHabitantesCriados());

        for (int i = 0; i < 10; i++) {
            System.out.println("\nSimulação do dia " + (i + 1));
            mundo.simularDia();
        }
    }
}