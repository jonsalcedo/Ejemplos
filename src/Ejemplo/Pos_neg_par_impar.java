package Ejemplo;

import java.util.Scanner;

public class Pos_neg_par_impar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Introduce un número (0 para acabar): ");
        numero = sc.nextInt();

        while (numero != 0) {

            if (numero > 0) {
                System.out.print("Positivo");
            } else {
                System.out.print("Negativo");
            }
            if(numero % 2 == 0){
                System.out.println(" Par");
            }else{
                System.out.println(" Impar");
            }

            System.out.print("Introduce un número (0 para acabar): ");                                  
            numero = sc.nextInt();
        }
    }
}