package banksystem;

import java.util.Scanner; // Usamos para poder receber os valores atraves do terminal

public class Main {
    public static void main(String[] args) {

        // Cria a ferramenta Scanner para ler o que o usuario vai digitar
        Scanner sc = new Scanner(System.in);

        System.out.println("### Bem-Vindo ao BankSystem - Criacao de Conta ###");
        System.out.println("Por favor, preencha as informacoes abaixo: ");

        System.out.println("Nome completo: ");
        String nomeInput = sc.nextLine();

        System.out.println("CPF: ");
        String cpfInput = sc.nextLine();

        System.out.println("Email: ");
        String emailInput = sc.nextLine();

        /* ----
        Vou passar inicialmente alguns valores fixos, depois finalizo o restante.
         ---- */

        String telefoneFixo = "47991541468";
        String dataNascimentoFixo = "19/05/2003";
        String tipoFiliacaoFixo = "Mae";
        String filiacaoFixo = "Minha Mae";
        String cepFixo = "89205600";

        /* ---- System.out.println("Telefone: ");
        String telefoneInput = sc.nextLine();

        System.out.println("Data de Nascimento: ");
        String nascimentoInput = sc.nextLine();

        System.out.println("Nome da Mae: ");
        String filiacaoInput = sc.nextLine();

        System.out.println("CEP: ");
        String cepInput = sc.nextLine(); ---- */


        // Agora chamamos o construtor em ContaBancaria para receber os dados do usuario
        ContaBancaria novaConta = new ContaBancaria(
                nomeInput,
                cpfInput,
                emailInput,
                telefoneFixo,
                dataNascimentoFixo,
                tipoFiliacaoFixo,
                filiacaoFixo,
                cepFixo
        );

        // Montamos uma mensagem de sucesso!!!!
        System.out.println("\n------------------------------------");
        System.out.println("Conta criada com sucesso!");
        System.out.println("Bem vindo(a), " + nomeInput + "!");
        System.out.println("\n------------------------------------");

        sc.close();
    }
}