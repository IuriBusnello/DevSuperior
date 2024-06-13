import java.util.Locale;
import java.util.Scanner;

public class desafioImposto {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Renda anual com salário: ");
        double rendaSalario = sc.nextDouble();
        System.out.print("Renda anual com prestação de serviço: ");
        double rendaPrestacao = sc.nextDouble();
        System.out.print("Renda anual com ganho de capital: ");
        double rendaCapital = sc.nextDouble();
        System.out.print("Gastos médicos: ");
        double gastosMedicos = sc.nextDouble();
        System.out.print("Gastos educacionais: ");
        double gastosEducacao = sc.nextDouble();

        // Cálculo do imposto sobre salário
        double salarioMensal = rendaSalario / 12;
        double impostoSalario;
        if (salarioMensal < 3000) {
            impostoSalario = 0;
        } else if (salarioMensal < 5000) {
            impostoSalario = 0.1 * rendaSalario;
        } else {
            impostoSalario = 0.2 * rendaSalario;
        }

        // Cálculo do imposto sobre prestação de serviços
        double impostoPrestacao = 0;
        if (rendaPrestacao > 0) {
            impostoPrestacao = 0.15 * rendaPrestacao;
        }

        // Cálculo do imposto sobre ganho de capital
        double impostoCapital = 0;
        if (rendaCapital > 0) {
            impostoCapital = 0.2 * rendaCapital;
        }

        // Cálculo do total de imposto bruto
        double totalImpostoBruto = impostoSalario + impostoPrestacao + impostoCapital;

        // Cálculo das deduções
        double gastosDedutiveis = gastosMedicos + gastosEducacao;
        double maxDeducao = totalImpostoBruto * 0.3;
        double deducao = Math.min(gastosDedutiveis, maxDeducao);

        // Cálculo do imposto líquido
        double totalImpostoLiquido = totalImpostoBruto - deducao;

        // Exibição do relatório
        System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
        System.out.println("CONSOLIDADO DE RENDA:");
        System.out.printf("Imposto sobre salário: %.2f%n", impostoSalario);
        System.out.printf("Imposto sobre serviços: %.2f%n", impostoPrestacao);
        System.out.printf("Imposto sobre ganho de capital: %.2f%n", impostoCapital);
        System.out.println("DEDUÇÕES:");
        System.out.printf("Máximo dedutível: %.2f%n", maxDeducao);
        System.out.printf("Gastos dedutíveis: %.2f%n", gastosDedutiveis);
        System.out.println("RESUMO:");
        System.out.printf("Imposto bruto total: %.2f%n", totalImpostoBruto);
        System.out.printf("Abatimento: %.2f%n", deducao);
        System.out.printf("Imposto devido: %.2f%n", totalImpostoLiquido);

        sc.close();
    }
}