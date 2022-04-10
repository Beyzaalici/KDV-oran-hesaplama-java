import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, kdvOran=0.18, kdvTutar, kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.println("Ucret tutarini giriniz: ");
        tutar = input.nextDouble();
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;
        double value = (tutar >=0 && tutar <=1000) ? (kdvOran = 0.18) : (kdvOran = 0.08);
        System.out.println("KDV'siz tutar: " + tutar);
        System.out.println("KDV Oranı: " + kdvOran );
        System.out.println("KDV Tutarı: " + kdvTutar);
        System.out.println("KDV'li tutar: " + kdvliTutar);



    }
}
