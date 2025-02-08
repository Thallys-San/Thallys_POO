package Matheus_POO;
import java.util.Scanner;
public class Ativ_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um numero: ");
        int num1 = sc.nextInt();
        System.out.println("Insira outro numero");
        int num2 = sc.nextInt();
        int result=Divisivel(num1,num2);
        ShowResult(result,num1, num2);
    }

    public static int Divisivel(int num1, int num2) {
        int aux;
        if (num1 % num2 == 0) {
            aux=0;
        } else if (num2 % num1 == 0) {
            aux=1;
        } else {
            aux=2;
        }
        return aux;
    }
    public static void ShowResult(int value, int num1, int num2){
        if (value==0) {
            System.out.println(num1 + " é divisível por " + num2);
        }else if (value==1){
            System.out.println(num2 + " é divisível por " + num1);
        }
    }
}
