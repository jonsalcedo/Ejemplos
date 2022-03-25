package Ejemplo;

import java.util.Scanner;

public class Multiplos_1_M {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, M;

        //Lectura de dos n�meros enteros N Y M
        //N y M deben ser positivos
        //N debe ser menor que M
        do {
            System.out.print("Introduce un n�mero entero positivo: ");
            N = sc.nextInt();
            if(N<=0){
                System.out.println("Debe introducir un n�mero positivo");
            }
        }while(N<=0);
        do {
            System.out.print("Introduce otro n�mero entero positivo mayor que " + N + ": ");            
            M = sc.nextInt();
            if(M<=0){
                System.out.println("Debe introducir un n�mero positivo");
            }else if(N>=M){
                System.out.println("Debe introducir un n�mero mayor que " + N);
            }
        }while(M<=0 || N >=M);
          


        //Mostrar los m�ltiplos de N desde 1 hasta M
        System.out.println("\nM�ltiplos de  " + N + " desde 1 hasta " + M + " : ");
        for (int i = 1; i <= M; i++) {
            if (i % N == 0) {
                System.out.println(i);
            }
        }
    }
}
