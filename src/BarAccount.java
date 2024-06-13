import java.util.Scanner;

public class BarAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite o sexo do cliente (F ou M): ");
        char sexo = sc.next().charAt(0);
        System.out.print("Digite a quantidade de cervejas consumidas: ");
        int qtdCervejas = sc.nextInt();
        System.out.print("Digite a quantidade de refrigerantes consumidos: ");
        int qtdRefrigerantes = sc.nextInt();
        System.out.print("Digite a quantidade de espetinhos consumidos: ");
        int qtdEspetinhos = sc.nextInt();


        int precoIngresso;
        switch (sexo) {
            case 'M':
            case 'm':
                precoIngresso = 10;
                break;
            case 'F':
            case 'f':
                precoIngresso = 8;
                break;
            default:
                System.out.println("Sexo inválido. Use 'M' para masculino ou 'F' para feminino.");
                return;
        }

        int precoCerveja = 5;
        int precoRefrigerante = 3;
        int precoEspetinho = 7;
        int precoCouvert = 4;


        int custoCervejas = qtdCervejas * precoCerveja;
        int custoRefrigerantes = qtdRefrigerantes * precoRefrigerante;
        int custoEspetinhos = qtdEspetinhos * precoEspetinho;

        int consumoTotal = custoCervejas + custoRefrigerantes + custoEspetinhos;


        if (consumoTotal > 30) {
            precoCouvert = 0;
        }


        int totalPagar = precoIngresso + consumoTotal + precoCouvert;

        System.out.println("\nRelatório da Conta");
        System.out.println("==================");
        System.out.printf("Ingresso: R$ %d%n", precoIngresso);
        System.out.printf("Consumo:%n");
        System.out.printf(" - Cervejas: %d x R$ %d = R$ %d%n", qtdCervejas, precoCerveja, custoCervejas);
        System.out.printf(" - Refrigerantes: %d x R$ %d = R$ %d%n", qtdRefrigerantes, precoRefrigerante, custoRefrigerantes);
        System.out.printf(" - Espetinhos: %d x R$ %d = R$ %d%n", qtdEspetinhos, precoEspetinho, custoEspetinhos);
        System.out.printf("Couvert Artístico: R$ %d%n", precoCouvert);
        System.out.println("==================");
        System.out.printf("Total a pagar: R$ %d%n", totalPagar);

        sc.close();
    }
}
