import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite um numero ");
        int A = sc.nextInt();
        int B = sc.nextInt();

       if (A % B == 0 || B % A == 0) {


           System.out.println("SAO MULTIPLOS ");
       }
       else {

           System.out.println("NAO SAO MULTIPLOS ");

       }





            sc.close();
        }


    }

