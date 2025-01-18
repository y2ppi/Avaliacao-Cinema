import java.util.*;

public class AvaliacaoCinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        int avaliacoesOtimas = 0;
        int contagemRuim = 0;
        int contagemPessimo = 0;
        double porcentagemPessimo = 0.0;
        double somaIdadesRuim = 0;
        int totalPessoas = 100;

        for (int pessoas = 1; pessoas <= totalPessoas; pessoas++) {
            System.out.println("=== Bem-vindo à nossa avaliação! ===\n");
            System.out.print("Digite sua idade: ");
            idade = sc.nextInt();
            sc.nextLine(); 

            System.out.println("Como você avalia nosso cinema?");
            System.out.println("Digite A para Ótimo");
            System.out.println("Digite B para Bom");
            System.out.println("Digite C para Regular");
            System.out.println("Digite D para Ruim");
            System.out.println("Digite E para Péssimo");

            String avaliacao = sc.nextLine();

            switch (avaliacao.toLowerCase()) {
                case "a":
                    System.out.println("Obrigado pela avaliação! Volte sempre.");
                    avaliacoesOtimas++;
                    break;
                case "b":
                    System.out.println("Obrigado pela avaliação! Volte sempre.");
                    break;
                case "c":
                    System.out.println("Obrigado pela avaliação! Volte sempre.");
                    break;
                case "d":
                    System.out.println("Obrigado pela avaliação! Sentimos muito que sua experiência não tenha sido a melhor possível.");
                    somaIdadesRuim += idade;
                    contagemRuim++;
                    break;
                case "e":
                    System.out.println("Obrigado pela avaliação! Sentimos muito que sua experiência não tenha sido a melhor possível.");
                    contagemPessimo++;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    pessoas--; // repete a entrada para esta pessoa
                    break;
            }
        }

        sc.close();

        if (contagemPessimo > 0) {
            porcentagemPessimo = (contagemPessimo * 100.0) / totalPessoas;
        }

        System.out.println("\n=== Estatísticas da Avaliação ===");
        System.out.println("Total de avaliações como 'Ótimo': " + avaliacoesOtimas);

        if (contagemRuim > 0) {
            double mediaIdadesRuim = somaIdadesRuim / contagemRuim;
            System.out.printf("Média de idade dos que avaliaram como 'Ruim': %.2f anos\n", mediaIdadesRuim);
        } else {
            System.out.println("Nenhuma avaliação como 'Ruim'.");
        }

        System.out.printf("Porcentagem de pessoas que avaliaram como 'Péssimo': %.2f%%\n", porcentagemPessimo);
    }
}
