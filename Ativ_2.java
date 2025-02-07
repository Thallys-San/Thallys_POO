//atividade Nota Maxima
package Thallys_POO;

import java.util.Scanner;

public class Ativ_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        int Nota = scanner.nextInt();
        int Result = nota(Nota);
        showResult(Result);
        scanner.close();
    }

    public static int nota(int x){
        int Aux;
        if (x >= 10) {
            Aux = 0;
        } else {
            Aux = 1;
        }
        return Aux;
    }

    public static void showResult(int value){
        if(value == 0) {
            System.out.println("O Aluno foi Aprovado com Nota Maxima!");
        }else {
            System.out.println("O Aluno não foi Aprovado com Nota Maxima!");
        }
    }
}

