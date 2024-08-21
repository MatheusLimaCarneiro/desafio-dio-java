import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int numero = 0;
        String agencia;
        String nomeCliente;
        double saldo;


        System.out.println("Por favor digite seu nome: ");
        nomeCliente = sc.nextLine();


        System.out.println("Por favor digite o numero do Usuario: ");
        numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor digite sua agência: ");
        agencia = sc.nextLine();

        System.out.println("Por favor digite seu saldo: ");
        saldo = sc.nextDouble();

        if(saldo < 0){
            System.out.println("Saldo invalido para saque.");
            System.out.println("Por favor digite um saldo valido: ");
            saldo = sc.nextDouble();
        }

        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
        ", conta "+ numero + " e seu saldo "+ saldo + " já está disponível para saque.");
    }
}
