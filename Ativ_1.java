// Atividade Numero Positivo Negativo
package Thallys_POO;

import java.util.Scanner;

public class Ativ_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um numero: ");
        int x = sc.nextInt();

        int Result = PositivoNegativo(x);
        showResult(Result, x);

    }

    public static int PositivoNegativo(int z) {
        int aux;
        if (z > 0) {
            aux = 0;
        } else if (z < 0) {
            aux = 1;
        }else {
            aux = 2;
        }
        return aux;
    }

    public static void  showResult(int value, int x){
        if (value == 0){
            System.out.printf("O numero é Positivo: "+ x);
        } else if (value == 1) {
            System.out.printf("O numero é Negativo: "+ x);
        }else {
            System.out.printf("O numero é Nulo: "+ x);
        }
    }
}
