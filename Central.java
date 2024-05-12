import java.util.Scanner;

public class Central {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        double a, b;
        String escolha;

        do {
            System.out.println("Digite o valor de A: ");
            a = scanner.nextDouble();
            System.out.println("Digite o valor de B: ");
            b = scanner.nextDouble();

            System.out.println("Escolha a operação:");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("Digite 'sair' para encerrar o programa");

            escolha = scanner.next();

            switch (escolha) {
                case "1":
                    System.out.println("O Resultado  da adição é: " + calculadora.somar(a, b));
                    break;
                case "2":
                    System.out.println("O Resultado da subtração é: " + calculadora.subtrair(a, b));
                    break;
                case "3":
                    System.out.println("Resultado da multiplicação: " + calculadora.multiplicar(a, b));
                    break;
                case "4":
                    System.out.println("Resultado da divisão: " + calculadora.dividir(a, b));
                    break;
                case "sair":
                    System.out.println("Encerrando Programa......");
                    break;
                default:
                    System.out.println("Escolha inválida");
                    break;
            }
        } while (!escolha.equals("sair"));

        scanner.close();
    }
}
