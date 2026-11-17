import java.util.Scanner;

public class OgrenciOrtalamaHesaplama {
    public static void main(String[] args) {
        int fizik,turkce,mat,kimya,tarih,muzik;
        Scanner input = new Scanner(System.in);
        System.out.print("matematik notunuzu giriniz: ");
        mat = input.nextInt();
        System.out.print("turkce notunuzu giriniz: ");
        turkce = input.nextInt();
        System.out.print("fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        System.out.print("kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        System.out.print("tarih notunuzu giriniz: ");
        tarih = input.nextInt();
        System.out.print("müzik notunuzu giriniz: ");
        muzik = input.nextInt();
        int ort=(mat+tarih+turkce+fizik+muzik+kimya);
        double sonuc = ort/6.0;
        System.out.print("Ortalamaniz:  "+sonuc);
    }
}