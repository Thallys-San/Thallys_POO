package Matheus_POO;
import java.util.Scanner;
public class Ativ_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe sua idade: ");
        int idade = sc.nextInt();
        System.out.print("Informe seu peso (kg): ");
        double peso = sc.nextDouble();
        sc.close();
        int result= Condicao(idade,peso);
        ShowResult(result);
    }

    public static int Condicao(int idade, double peso) {
        int aux;
        if (idade >= 18 && idade <= 65 && peso >= 50) {
            aux = 0;
        } else {
            aux = 1;
        }
        return aux;
    }
    public static void ShowResult(int value){
        if (value==0){
            System.out.println("Você está apto(a) para doar sangue");
        } else if (value==1) {
            System.out.println("Você não está apto(a) para doar sangue");
        }
    }
}