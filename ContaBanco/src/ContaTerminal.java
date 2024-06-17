import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Olá, seja bem-vindo(a) a sua conta de banco!");

        System.out.println("Por favor, digite o número da sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o número sa agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o saldo(ponto no lugar da virgula): ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", " + "obrigada por criar uma conta em nosso banco, sua agência é " + agencia +"," + "conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
