import java.util.Scanner;
public class UcgenAlan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b,c;
        double ucgenalan,ucgencevre,u;

        System.out.print("1. kenarı giriniz :");
        a = input.nextInt();

        System.out.print("2. kenarı giriniz : ");
        b = input.nextInt();

        System.out.print("3. kenarı giriniz: ");
        c = input.nextInt();

        ucgencevre = (a+b+c);
        System.out.println("Üçgenin çevresi: "+ ucgencevre);
        u = ucgencevre/2;
        ucgenalan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.print("Üçgenin Alanı: "+ ucgenalan);




    }
}
