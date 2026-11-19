import java.util.Scanner;

public class TaksimetreHesapla {
    public static void main(String[] args) {

       int acilis_ucreti;
       double km,mesafe,odenecek_tutar;

        acilis_ucreti = 10;
        km = 2.20;

        Scanner input = new Scanner(System.in);

        System.out.print("kac kilometre yol gittiniz? : ");
        mesafe = input.nextDouble();

        odenecek_tutar = acilis_ucreti + (mesafe*km);

        // odenecek minimum tutar 20 tldir 20 tlinin altındaki ücretlerde yine 20 tl ödenecektir.
        if (odenecek_tutar<=20)
        {
            System.out.print("odenecek tutar: 20 TL");
        }
        else {
            System.out.printf("odenecek tutar: %.2f TL",odenecek_tutar);
        }
        // Alternatif kısa yazım:
        // odenecek_tutar = (odenecek_tutar < 20) ? 20 : odenecek_tutar;

    }
}
