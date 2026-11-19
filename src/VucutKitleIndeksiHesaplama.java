import java.util.Scanner;

public class VucutKitleIndeksiHesaplama {
    public static void main(String[] args) {

        float kilo,boy,indeks;

        Scanner input = new Scanner(System.in);

        System.out.print("boyunuzu metre cinsinden giriniz: ");
        boy = input.nextFloat();

        System.out.print("kilonuzu kg cinsinden giriniz: ");
        kilo = input.nextFloat();

        indeks = kilo/(boy*boy);

        System.out.printf("vücut kitle indeksiniz: %.2f ",indeks);
    }
}
