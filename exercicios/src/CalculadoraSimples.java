import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o primeiro número:");
        double numero1 = scanner.nextDouble();

        System.out.println("digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("escolha a operação: +, -, /, *");
        char operacao = scanner.next().charAt(0);

        double resultado = 0;

        switch (operacao) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                
                } else {
                    System.out.println("erro: divisão por zero!");
                    return;
                }
                break;
            default:
                System.out.println("operação inválida!");
                return;
        }
        System.out.println("resultado " + resultado);

        scanner.close();

    }
}
