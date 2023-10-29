import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        double raio, area,  PI;

        raio = sc.nextInt();
        area = sc.nextInt();
        PI = 3.14159;

        area = PI * raio * raio;



        System.out.printf("Area =  %.4f%n " , area);

                sc.close();
    }
}