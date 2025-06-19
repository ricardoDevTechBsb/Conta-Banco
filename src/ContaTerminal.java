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
        scanner.nextLine();
        numero  = scanner.nextInt();

        System.out.printf("Por favor, digite a Agência !");
        scanner.nextLine();
        agencia = scanner.next();

        System.out.printf("Por favor, digite o nome do Cliente !");
        scanner.nextLine();
        nomeCliente = scanner.next();

        System.out.printf("Por favor, digite o saldo !");
        scanner.nextLine();
        saldo = scanner.nextDouble();

        scanner.nextLine();
        System.out.printf("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
