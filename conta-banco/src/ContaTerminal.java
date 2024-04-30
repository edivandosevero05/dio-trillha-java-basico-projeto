import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu nome completo!");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta!");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite seu saldo!");
        double saldo = scanner.nextDouble();

        String mensagem = String.format("\nOlá, %s, obrigado por criar uma conta em nosso banco, sua agência é %s," +
                " conta %d e seu saldo %,.2f já está disponível para saque", nomeCliente,agencia, numeroConta, saldo);
        System.out.println(mensagem);

    }

}
