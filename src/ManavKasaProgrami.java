import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {

        double armutKilo,armutFiyat,elmaKilo,elmaFiyat,domatesKilo,domatesFiyat,muzKilo,muzFiyat,patlicanKilo,patlicanFiyat;
        double toplam;

        Scanner input = new Scanner(System.in);

        armutFiyat=2.14;
        elmaFiyat=3.67;
        domatesFiyat=1.11;
        muzFiyat=0.95;
        patlicanFiyat=5.00;

        System.out.print("armuttan kac kilo aldiniz? : ");
        armutKilo = input.nextDouble();

        System.out.print("elmadan kac kilo aldiniz? : ");
        elmaKilo = input.nextDouble();

        System.out.print("domatesten kac kilo aldiniz? : ");
        domatesKilo = input.nextDouble();

        System.out.print("muzdan kac kilo aldiniz? : ");
        muzKilo = input.nextDouble();

        System.out.print("patlicandan kac kilo aldiniz? :");
        patlicanKilo = input.nextDouble();

        toplam = (armutFiyat*armutKilo)+(elmaFiyat*elmaKilo)+(domatesFiyat*domatesKilo)+(muzFiyat*muzKilo)+(patlicanFiyat*patlicanKilo);

        System.out.printf("ödeyeceginiz toplam tutar: %.2f TL",toplam);




    }
}
