import java.util.Scanner;
public class DaireAlani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r,a;
        double pi =3.14,alan;

        System.out.print("Yarı çapını giriniz: ");
        r = input.nextInt();
        System.out.print("Açı ölçüsünü giriniz: ");
        a = input.nextInt();

        alan = (pi*r*r*a)/360;
        System.out.print("Dairenin Alanı: " + alan);

    }
}
