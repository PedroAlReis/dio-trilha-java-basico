import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o numero da Agência: ");
        String agencia = scanner.nextLine();     

        System.out.println("Por favor, digite o Número da Conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o o Saldo");
        double saldoCliente = scanner.nextDouble();

        System.out.println("Olá Sr/Srta. " + nomeCliente + ", obrigado/a por você escolher criar uma conta em nosso banco, "
        + "sua agência é " + agencia + ", a sua conta é " + numeroConta 
        + " e seu saldo " + saldoCliente + " já está disponível para saque. Tenha um excelente dia!");

        scanner.close();
    }
}
