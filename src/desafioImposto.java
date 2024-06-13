import java.util.Locale;
import java.util.Scanner;

public class desafioImposto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Renda anual com salário: ");
        double rendaSalario = sc.nextDouble();
        System.out.println("Renda anual com prestação de serviço: ");
        double rendaPrestacao = sc.nextDouble();
        System.out.println("Renda anual com ganho de capital: ");
        double rendaCapital = sc.nextDouble();
        System.out.println("Gastos médicos: ");
        double gastosMedicos = sc.nextDouble();
        System.out.println("Gastos educacionais: ");
        double gastosEducacao = sc.nextDouble();

        double impostosalario;

        if (rendaSalario / 12 < 3000) {
            impostosalario = 0;
        } else if (rendaSalario / 12 < 5000) {
            impostosalario = 10;
        } else {
            impostosalario = 20;
        }

        double impostoPrestacao;

        if (rendaPrestacao > 0) {

            impostoPrestacao = 15;

        }

        double impostoCapital;

        if (rendaCapital > 0) {

            impostoCapital = 20;
        }

        


    }


}
