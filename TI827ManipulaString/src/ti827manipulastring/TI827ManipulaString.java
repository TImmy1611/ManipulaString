
package ti827manipulastring;

import java.util.Scanner;


public class TI827ManipulaString {

    public static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        int op;
        do{
            System.out.println("------ MENU ------");
            System.out.println("0 - Sair");
            System.out.println("1 - Tamanho String");
            System.out.println("2 - Soletra String");
            System.out.println("Insira a opção pretendida");
            op=ler.nextInt();
            switch (op){
                case 0: break;
                case 1:
                    System.out.println("A string inserida tem: "+
                    ExerciciosStrings.contaCaracteres()+" carcteres");
                    break;
                case 2:
                    ExerciciosStrings.soletraString();
                    break;
                default:
                    System.out.println("Escolha uma opção válida");
            }
        }while(op!=0);
    }
    
}
