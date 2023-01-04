import java.util.Scanner;
public class VucutKitleIndeksi {
    public static void main(String[] args) {
        int kg;
        double vki,boy;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        kg = input.nextInt();

        vki = kg / (boy * boy);

        System.out.print("Vücut Kitle İndeksiniz: "+ vki);


    }
}
