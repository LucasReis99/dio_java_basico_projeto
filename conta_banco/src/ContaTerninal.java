import java.util.Scanner;

public class ContaTerninal {
    public static void main(String[] args) {
        // Criação do objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pedir ao usuário que insira o número da conta
        System.out.print("Olá! Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();

        // Consumir a linha pendente para evitar problemas ao ler a próxima linha
        scanner.nextLine();

        // Pedir ao usuário que insira o número da agência
        System.out.print("Agora precisamos do número da agência: ");
        String agencia = scanner.nextLine();

        // Pedir ao usuário que insira o nome do cliente
        System.out.print("Informe nome completo do cliente: ");
        String nomeCliente = scanner.nextLine();

        // Pedir ao usuário que insira o saldo
        System.out.print("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();

        // Fechar o objeto scanner
        scanner.close();

        // Exibir a mensagem formatada
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
                        + "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque." + "seja muito bem-vindo ao nosso banco!";
        System.out.println(mensagem);
    }
}