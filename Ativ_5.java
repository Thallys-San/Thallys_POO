package Matheus_POO;
import java.util.Scanner;
public class Ativ_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira sua senha: ");
        int senha= sc.nextInt();
        sc.close();
        int confirmacao=Acesso(senha);
        ShowResult(confirmacao);
    }
    public static int Acesso (int senha) {
        int aux;
        if (senha == 1234) {
            aux=0;
        } else {
            aux=1;
        }
        return aux;
    }
    public static void ShowResult(int value){
        if (value==0){
            System.out.println("acesso liberado");
    } else if (value==1){
            System.out.println("acesso negado");
        }
    }
    }
