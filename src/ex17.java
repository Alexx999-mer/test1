import java.util.Scanner;
public class ex17 {  //Scrieti un program incare cititi de la tastatura un numar, si calculati:
    public static void main(String[] args) {
        System.out.println("Alege un numar: ");
        Scanner keyboardInput = new Scanner(System.in);
        double x = keyboardInput.nextDouble();
        double y = 5;
        double z = 12.3;
        double s = -3.2;
        double t = 4;
        double k = 6;

        System.out.println("Primul numar ales este: " + x);
        System.out.println("Al doilea numar ales este: " + y);

        System.out.println(suma(x, y));
        System.out.println(scadere(x,z));
        System.out.println(inmultire(x, s));
        System.out.println(impartire(x, t));
        System.out.println(modul(x, k));
    }
    public static double suma(double x, double y)   {
        double rezultat = x + y;
        System.out.println("Rezultatul este egal cu: " + rezultat);
        return rezultat;
    }
    public static double scadere(double x, double z) {

        System.out.println("Primul numar ales este: " + x);
        System.out.println("Al doilea numar ales este: " + z);
        double rezultat = x - z;
        System.out.println("Rezultatul este egal cu: " + rezultat);
        return rezultat;
    }
    public static double inmultire(double x, double s) {

        System.out.println("Primul numar ales este: " + x);
        System.out.println("Al doilea numar ales este: " + s);
        double rezultat = x * s;
        System.out.println("Rezultatul este egal cu: " + rezultat);
        return rezultat;
    }
    public static double impartire(double x, double t) {

        System.out.println("Primul numar ales este: " + x);
        System.out.printf("Al doilea numar ales este: " + t);
        double rezultat = x / t;
        System.out.println("Rezultatul este egal cu: " + rezultat);
        return rezultat;
    }
    public static double modul(double x, double k) {

        System.out.println("Primul numar ales este: " + x);
        System.out.println("Al doilea numar ales este: " + k);
        double rezultat = x % k;
        System.out.println("Rezultatul este egal cu: " + rezultat);
        return rezultat;
    }
}