import java.util.Scanner;
public class ex16 {  //Scrieti un program in care creati o metoda unde cititi 2 numere de la tastatura, le stocati in variabile, si dupa ce le-ati citit, afisati-le pe ecran.
    public static void main(String[] args) {
        System.out.println("Alege primul numar: ");
        Scanner keyboardInput = new Scanner(System.in);
        int x = keyboardInput.nextInt();
        System.out.println("Alege al doilea numar: ");
        int y = keyboardInput.nextInt();
    System.out.println("Primul numar ales este: " + x);
    System.out.println("Al doilea numar ales este: " + y);

    }
}