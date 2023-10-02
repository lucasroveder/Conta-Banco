import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // criando variaves utilizadas em todo o codigo
        ContaTerminal[] contas = new ContaTerminal[5];
        int menu1 = 1;
        int posicaoContas = 0;
        Scanner sc = new Scanner(System.in);
        // faz um menu interativo com o usuario
        int menu2 = 0;
        while (menu1 == 1) {
            int i = 0;
            System.out.println("===============================================================");
            System.out.println("Ola, cliente o que deseja fazer?");
            System.out.println("1. Abrir uma nova conta");
            System.out.println("2. Verificar situacao da conta");
            System.out.println("3. Sair");
            System.out.println("===============================================================");
            i = sc.nextInt();
            if (i != 1 && i != 2 && i != 3) {
                System.out.println("insira um numero valido");
                System.out.println("retornando ao menu 1");
            }
            if (i == 1) {
                sc.nextLine();
                System.out.println("Digite seu nome completo");

                String nome = sc.nextLine();
                System.out.println("Seu nome eh: " + nome);

                System.out.println("Digite o numero da sua agencia xxx-x (Exemplo 123-4)");
                String agencia = sc.nextLine();
                System.out.println("Sua agencia é: " + agencia);

                System.out.println("Digite o numero desejado para sua conta (Exemplo: 1021)");
                int numero = sc.nextInt();
                System.out.println("Seu numero eh: " + numero);

                System.out.println("digite o saldo que deseja adicionar");
                double saldo = sc.nextDouble();
                System.out.println("Seu saldo é: " + saldo);

                contas[posicaoContas] = new ContaTerminal(numero, agencia, nome, saldo);
                posicaoContas++;
            }
            if (i == 2) {
                sc.nextLine();
                System.out.println("Digite sua agencia (Exemplo: 123-4)");
                String agencia = sc.nextLine();

                System.out.println("Digite o numero da sua conta no formato xxxx (Exemplo: 1021)");
                int numero = sc.nextInt();

                for (int verificaAgencias = 0; verificaAgencias < 5; verificaAgencias++) {
                    if (agencia.equals(contas[verificaAgencias].getAgencia()) &&
                            numero == contas[verificaAgencias].getNumero()) {
                        menu2 = 1;
                    } else {
                        System.out.println("Conta nao encontrada no sitema");
                    }
                    while (menu2 == 1) {
                        int z = 0;
                        System.out.println("Ola " + contas[verificaAgencias].getNome() + " ");
                        System.out.println("===============================================================");
                        System.out.println("QUE OPERACAO DESEJA REALIZAR?");
                        System.out.println("1. Fazer um deposito");
                        System.out.println("2. Verificar situacao da conta");
                        System.out.println("3. Fazer um saque");
                        System.out.println("4. Sair");
                        System.out.println("===============================================================");
                        z = sc.nextInt();

                        if (z == 1) {
                            sc.nextLine();
                            System.out.println("Digite o valor do deposito a ser efetuado");
                            double deposito = sc.nextDouble();
                            contas[verificaAgencias].fazDeposito(deposito);
                        }

                        if (z == 2) {
                            System.out.println("O saldo do cliente " + contas[verificaAgencias].getNome() + " é de: "
                                    + contas[verificaAgencias].getSaldo());
                        }

                        if (z == 3) {
                            sc.nextLine();
                            System.out.println("Digite o valor do saque a ser efetuado");
                            double saque = sc.nextDouble();
                            contas[verificaAgencias].fazSaque(saque);
                        }

                        if (z == 4) {
                            menu2 = 0;
                        }

                    }
                    break;
                }
            }
            if (i == 3) {
                sc.close();
                break;
            }
        }
    }
}
