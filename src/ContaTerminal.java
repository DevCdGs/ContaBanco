    import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

    //Declaração de Variáveis;

        String nome;
        String Agencia;
        int numero;
        double saldo = 250.00;

    //Inserindo classe Scanner;

        System.out.println("Por favor, digite o seu nome: ");
        nome = Sc.nextLine();

        System.out.println("Por favor, digite a sua agência: ");
        Agencia = Sc.nextLine();

        System.out.println("Por favor, digite o numero da sua conta: ");
        numero = Sc.nextInt();

        System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nosso banco!" + "\nSua agência é: " + Agencia + "\nO número de sua conta é: " + numero + " \nO saldo de " + saldo + " já está disponível para saque em conta corrente.");


    }
}