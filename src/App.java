import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        String tipoDeConta = "";
        double saldo = 0.00;
        int contOp = 0;

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("\nSeja bem-vindo ao Banco JJ!!!");
        System.out.println("\n-------------------------------------------------------------------------");
        System.out.println("\nInsira seu nome completo: ");
        String nome = scanner.nextLine();
        System.out.println("Qual o tipo da conta: [1]Corrente [2]Poupanca");
        int nConta = scanner.nextInt();

        switch (nConta) {
            case 1:
                tipoDeConta = "Corrente";
                break;
            case 2:
                tipoDeConta = "Poupanca";
                break;
            default:
                System.out.println("Operacao invalida!!");
                break;
        }

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("\nDados iniciais do cliente");
        System.out.println("\nNome : " + nome);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Saldo: " + df.format(saldo));
        System.out.println("\n-------------------------------------------------------------------------");

        while (contOp != 4) {
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("\n[1] Consultar saldos");
            System.out.println("[2] Receber transferencia");
            System.out.println("[3] Realizar transferencia");
            System.out.println("[4] Sair");
            System.out.println("\n-------------------------------------------------------------------------");
        contOp = scanner.nextInt();
            switch (contOp) {
                case 1:
                    System.out.println("Saldo atual: " + df.format(saldo));
                    break;
                case 2:
                    System.out.println("Informe o valor a receber: ");
                    double receber = scanner.nextDouble();
                    saldo += receber;
                    break;
                case 3:
                    System.out.println("Informe o valor que deseja transferir: ");
                    double transferir = scanner.nextDouble();
                    if (saldo < transferir){
                    System.out.println("Saldo insuficiente para realizar a trasnferencia!!!");
                    } else {
                    saldo -= transferir;
                    }
                    break;
                case 4:
                    System.out.println("Sessao encerrada");
                    break;
                default:
                    System.out.println("Operacao invalida!!!");
                    break;
            }
            
        }
        scanner.close();
    }
}
