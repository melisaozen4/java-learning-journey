import java.util.Scanner;

public class DikUcgenHipotenus {
    public static void main(String[] args) {

        int a,b;
        double c;

        Scanner input = new Scanner(System.in);

        System.out.print("kenar uzunlugunu giriniz: ");
        a = input.nextInt();

        System.out.print("diger kenar uzunlugunu giriniz: ");
        b = input.nextInt();

        c=Math.sqrt((a*a)+(b*b));

        System.out.print("hipotenusun uzunlugu: "+c);


    }
}
