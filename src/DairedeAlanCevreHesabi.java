import java.util.Scanner;

public class DairedeAlanCevreHesabi {
    public static void main(String[] args) {

        int yaricap;
        double pi=3.14,cevre,alan;

        Scanner input = new Scanner(System.in);

        System.out.print("lutfen yaricapi giriniz: ");
        yaricap = input.nextInt();

        alan = pi*yaricap*yaricap;
        cevre = 2*pi*yaricap;

        System.out.printf("dairenin alani: %.2f \n",alan);
        System.out.printf("dairenin cevresi: %.2f ",cevre);
    }

}
