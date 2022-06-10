import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        char operacao;
        Scanner sc = new Scanner(System.in);
        System.out.println("CALCULADORA: Selecione a operação:\nA ADIÇÃO \nB SUBTRAÇÃO \nC MULTIPLICAÇÃO \nD DIVISÃO");
        operacao = sc.nextLine().charAt(0);
        System.out.println("Digite o valor de x");
        int x = sc.nextInt();
        System.out.println("Digite o valor de y");
        int y = sc.nextInt();
    switch(operacao){
        case 'A':
            System.out.println(x+y);
            break;
        case 'B':
              System.out.println(x-y);
              break;
        case 'C':
            System.out.println(x*y);
            break;
        case 'D':
            System.out.println(x/y);
            break;
        default :
            System.out.println("Codigo Invalido");
    }     
     }
 }



