import java.util.Scanner;

public class ColetaDados {
    public static void main(String[] args) {
        
        // criando o Scanner pra conseguir ler o que o usuário digitar no console
        Scanner leitor = new Scanner(System.in);

        System.out.println("=== SISTEMA DE SELEÇÃO INTERESTELAR ===");
        System.out.print("Por favor, insira os dados do candidato: ");

        // aqui eu peço o nome e já leio direto como texto
        System.out.print("\nNome completo do aspirante: ");
        String nome = leitor.nextLine();

        // agora pego a idade (número inteiro)
        System.out.print("Idade terrestre: ");
        int idade = leitor.nextInt();

        // aqui é a altura, que pode ter decimal (tipo 1.75)
        // dependendo do PC, pode precisar usar vírgula ou ponto
        System.out.print("Altura (em metros): ");
        double altura = leitor.nextDouble();

        // perguntando se já teve experiência com pilotagem de drones (true ou false)
        System.out.print("Possui experiência com pilotagem de drones? (true/false): ");
        boolean temExperiencia = leitor.nextBoolean();

        // só jogando um espacinho pra organizar melhor a saída
        System.out.println("\n--- PROCESSANDO DADOS DO FICHA ---");

        // aqui mostro tudo que foi digitado pelo usuário
        System.out.printf("Candidato: %s\n", nome);
        System.out.printf("Idade: %d anos | Altura: %.2f m\n", idade, altura);
        System.out.printf("Experiência com drones: %b\n", temExperiencia ? "Sim" : "Não");

        // regra simples: só passa se tiver mais de 18 anos
        if (idade >= 18 && idade <= 45) {
            System.out.println("Status: Apto para os testes físicos.");
        } else {
            System.out.println("Status: Idade fora dos parâmetros da missão.");
        }

        // fechando o scanner pra evitar vazamento de recurso (boa prática)
        leitor.close();
        System.out.println("----------------------------------------");
    }
}