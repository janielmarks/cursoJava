import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroFunc ,quantidadeHoras;
        double  valorHora , salario;

        numeroFunc = sc.nextInt();
        quantidadeHoras = sc.nextInt();
        valorHora = sc.nextInt();



        salario = valorHora * quantidadeHoras;

        System.out.println("numero do funcionario é = " + numeroFunc);
        System.out.printf("o salario é =  %.2f%n", salario);

                sc.close();
    }
}