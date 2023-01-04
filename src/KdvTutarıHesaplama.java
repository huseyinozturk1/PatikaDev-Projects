import java.util.Scanner;
public class KdvTutarıHesaplama {
    public static void main(String[] args) {
double tutar, kdvOrani1=0.18, kdvOrani2=0.08, kdvTutari, kdvOrani;
        Scanner input = new Scanner(System.in);
        System.out.print("ücret tutarını giriniz :");
        tutar = input.nextDouble();
        kdvTutari = (tutar <= 1000) ? tutar +(tutar*kdvOrani1) : tutar+(tutar*kdvOrani2);
        kdvOrani = (tutar<=1000) ? kdvOrani1 : kdvOrani2;
        System.out.println("Net tutarınız :" + kdvTutari);
        System.out.println("KDVsiz tutar: " + tutar);
        System.out.println("KDv oranınız: "+ kdvOrani);
    }
}
