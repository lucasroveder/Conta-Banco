import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // criando variaves utilizadas em todo o codigo
        ContaTerminal[] contas = new ContaTerminal[5];
        int menu1 = 1;
        int posicaoContas = 0;
        Scanner sc = new Scanner(System.in);
        // faz um menu interativo com o usuario
        while(menu1 == 1){
            int i = 0;
            System.out.println("===============================================================");
            System.out.println("Ola, cliente o que deseja fazer?");
            System.out.println("1. Abrir uma nova conta");
            System.out.println("2. Verificar situacao da conta");
            System.out.println("3. Sair");
            System.out.println("===============================================================");
            i = sc.nextInt();
            if(i!=1 && i!=2 && i!=3){
                System.out.println("insira um numero valido");
                System.out.println("retornando ao menu 1");
            }
            if(i == 1){
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
            if (i == 2){
                sc.nextLine();
                System.out.println("Digite sua agencia (Exemplo: 123-4)");
                String agencia = sc.nextLine();

                System.out.println("Digite o numero da sua conta no formato xxxx (Exemplo: 1021)");
                int numero = sc.nextInt();

                for (int verificaAgencias = 0; verificaAgencias<5; verificaAgencias++){
                    if(
                    agencia.equals(contas[verificaAgencias].getAgencia()) &&
                    numero == contas[verificaAgencias].getNumero()){
                        System.out.println("O saldo do cliente " + contas[verificaAgencias].getNome() + " é de: " + contas[verificaAgencias].getSaldo());
                        break;
                    }
                    else if(verificaAgencias !=4){
                        System.out.println("Verificando....");
                    }
                    else{
                        System.out.println("Conta nao encontrada no sitema");
                    }

                }
            }
            if(i==3){
                break;
            }
            
        }
        sc.close();
    }
}

