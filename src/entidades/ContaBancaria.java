package entidades;

public class ContaBancaria {

    //Classe bancária com métodos para depositar, sacar e verificar saldo.

    //Atributos privados.
    private final String titular;
    private double saldo;

    //Construtor para inicializar uma nova instância da classe 'ContaBancaria'.
    public ContaBancaria(String titular, double saldoInicial){
        this.titular = titular;
        this.saldo = saldoInicial;

    }

    // Método para obter o nome do titular da conta
    public String getTitular() {
        return titular;
    }

    //Método para obter o saldo da conta. Retorna o saldo atual da conta.
    public double getSaldo(){
        return saldo;
    }

    //Método para depositar. Ele vefica se a quantia é positiva.
    public void depositar(double quantia){
        if (quantia > 0){ // Se for maior que 0, adiciona a quantia ao saldo e imprime uma mensagem de sucesso.
            saldo += quantia;
            System.out.println("Depósito realizado com sucesso!");
            System.out.println("Novo saldo: " + saldo);
        }
        else { // Se não for maior que 0, imprime uma mensagem informando que a quantia deve ser positiva.
            System.out.println("A Quantia do depósito deve ser positiva.");
        }
    }
    //Método para saacar dinheiro. Permite sacar um valor da conta. Realiza duas verificações.
    public void sacar(double quantia){
        if (quantia > 0){ //Se a quantia é positiva:
            if (quantia <= saldo){ //Se a quantia for menor ou igual ao saldo disponivel na conta...
                saldo -= quantia; //Subtraia a quantia do saldo e imprime uma mensagem de sucesso!
                System.out.println("Saque realizado com sucesso!");
                System.out.println("Novo saldo: " + saldo);
            }
            else { //Se a quantia for maior que o saldo disponível, imprime uma mensagem informando que os fundos são insuficintes.
                System.out.println("Fundos insuficientes para este saque.");
            }
        }
            else{ //Se a quantia não for positiva, imprime uma mensagem informando que a quantia deve ser positiva.
            System.out.println("A quantia do saque deve ser positiva.");
        }
        }
    }

