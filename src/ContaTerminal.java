import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.printf("Por favor, digite o número da Agência !");
        numero  = scanner.nextInt();
        scanner.nextLine();

        System.out.printf("Por favor, digite a Agência !");
        agencia = scanner.next();
        scanner.nextLine();

        System.out.printf("Por favor, digite o nome do Cliente !");
        nomeCliente = scanner.next();
        scanner.nextLine();

        System.out.printf("Por favor, digite o saldo !");
        saldo = scanner.nextDouble();
        scanner.nextLine();

        System.out.printf("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
