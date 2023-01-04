import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armut,elma,domates,muz,patlican,toplam;

        Scanner input =new Scanner(System.in);

        System.out.print("Armut kaç kg? : ");
        armut = input.nextInt();
        System.out.print("Elma kaç kg? : ");
        elma = input.nextInt();
        System.out.print("Domates kaç kg? : ");
        domates = input.nextInt();
        System.out.print("Muz kaç kg? : ");
        muz = input.nextInt();
        System.out.print("Patlıcan kaç kg? : ");
        patlican = input.nextInt();

        toplam = armut*2.14 + elma*3.67 + domates*1.11 + muz*0.95 + patlican*5;

        System.out.print("Toplam Tutarınız: "+ toplam + " TL");

    }
}
