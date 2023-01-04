import java.util.Scanner;
public class KmHesabi {
    public static void main(String[] args) {
        int km;
        double perkm = 2.20,toplam=10;
    Scanner girdi = new Scanner(System.in);
        System.out.print("Mesafeyi Giriniz: ");
        km = girdi.nextInt();
        toplam += km * perkm;

        toplam = (toplam < 20) ? 20 : toplam;
        System.out.println("Ücretiniz: "+ toplam);
    }
}
