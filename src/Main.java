import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta !");

        int numeroConta = scanner.nextInt();

        scanner.nextLine();


        System.out.println("Por favor, digite o número da agência !");


        String agencia = scanner.nextLine();


        System.out.println("Por favor, digite o Nome do Cliente !");


        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o Saldo !");

        double saldo = scanner.nextInt();


        ContaTerminal conta = new ContaTerminal(numeroConta, agencia, nome, saldo);

        System.out.println("Olá" + conta.getNomeCliente() +", obrigado por criar uma conta em nosso banco, sua agência é " +
                conta.getAgencia()+ ", "+ conta.getNumero() +" e seu saldo "+conta.getSaldo()+ " já está disponível para saque");


    }
}