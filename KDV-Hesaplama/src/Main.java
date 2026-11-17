import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //KDV tutarı hesaplayan program

        double tutar,kdvOran=0.18,kdvTutar,kdvliTutar;
        Scanner input = new Scanner(System.in);
        System.out.print("Para değerini giriniz: ");
        tutar = input.nextDouble();

        System.out.println("kdv'siz tutar: "+tutar);

        System.out.println("kdv orani: "+kdvOran);

        kdvTutar = tutar*kdvOran;
        System.out.println("kdv tutari: "+kdvTutar);

        kdvliTutar = kdvTutar+tutar;
        System.out.print("kdvli tutar: "+kdvliTutar);
    }
}