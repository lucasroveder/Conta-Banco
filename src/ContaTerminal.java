public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nome;
    private double saldo;

    // Contructor
    public ContaTerminal(int numero, String agencia, String nome, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    // Getters And Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void fazDeposito(double n){
        this.saldo = this.saldo + n;
    }

    public int fazSaque(double n){
        if (n>this.saldo){
            System.out.println("Saldo insuficiente");
            return 0;
        }
        else{
            this.saldo = this.saldo - n;
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque";
    }
}
