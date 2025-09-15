package banksystem;
import java.math.BigDecimal;
import java.util.Scanner;

public class ContaBancaria {

    // Informacoes do usuario
    private String nomeCompleto;
    private String cpf;
    private String email;
    private String telefone;
    private String dataNascimento;
    private String tipoFiliacao; // Somente 'mae'
    private String filiacao; // Nome da 'filiacao'
    private String cep; // CEP do usuario -> Chama a API ViaCEP;

    // Armazenamento do saldo do usuario
    private BigDecimal saldo;

    public ContaBancaria(String nomeCompleto, String cpf, String email, String telefone,
                      String dataNascimento, String tipoFiliacao, String filiacao, String cep) {

        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.tipoFiliacao = tipoFiliacao;
        this.filiacao = filiacao;
        this.cep = cep;

        // Valor do saldo definido como 0 inicialmente
        this.saldo = BigDecimal.ZERO;
    }

}