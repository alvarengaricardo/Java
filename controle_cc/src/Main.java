/*
* Controle de saldo conta corente por aplicativo
*
* Não há opção de saque
*
* Menu:
* 1 - Receber valor
* 2 - Enviar valor
* 3 - Consultar Saldo
* 4 - Sair
*
* Conta com saldo inicial igual a R$ 0,00
*
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double saldoCC = 0;
        double valorTransacao = 0;
        int opcao = 0;
        Scanner leitura = new Scanner(System.in);

        String menu = """
                      
                      1 - Receber valor
                      2 - Enviar valor
                      3 - Consultar Saldo
                      4 - Sair                      
                      """;

        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o valor da transação.");
                    valorTransacao = leitura.nextDouble();
                    saldoCC += valorTransacao;
                    System.out.println("Novo saldo: R$" + saldoCC);
                    break;
                case 2:
                    System.out.println("Digite o valor da transação.");
                    valorTransacao = leitura.nextDouble();
                    if (valorTransacao > saldoCC){
                        System.out.println("Saldo insuficiente!");
                    } else {
                        saldoCC -= valorTransacao;
                        System.out.println("Novo saldo: R$" + saldoCC);
                    }
                    break;
                case 3:
                    System.out.println("Saldo: R$" + saldoCC);
                    break;
            }
        }
    }
}