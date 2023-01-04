import java.util.Scanner;

public class OrtalamaHesaplama {
        public static void main(String[] args) {
            // Değişkenleri oluştur.
            int mat, fizik, kimya, turkce, tarih, muzik;

            //Scanner sınıfını tanımla.
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan değerleri al.
            System.out.print("Matematik Notunuzu giriniz: ");
            mat = input.nextInt();

            System.out.print("Fizik notunuzu giriniz: ");
            fizik = input.nextInt();

            System.out.print("Kimya notunuzu giriniz: ");
            kimya = input.nextInt();

            System.out.print("Turkce notunuzu giriniz: ");
            turkce = input.nextInt();

            System.out.print("Tarih notunuzu giriniz: ");
            tarih= input.nextInt();

            System.out.print("Müzik notunzu giriniz: ");
            muzik = input.nextInt();

            double ortalama = (mat + fizik + kimya + turkce + tarih + muzik) / 6;
            System.out.println("Dönem ortalamanız:" +ortalama );


            String sonuc = (ortalama >= 60) ? "Sınıfı Geçtiniz." : "Sınıfta Kaldınız.";
            System.out.println(sonuc);


    }
}