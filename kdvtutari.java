import java.util.Scanner;

/**
 * kdvtutari
 */
public class kdvtutari {

    public static void main(String[] args) {

        double tutar ;

        Scanner input = new Scanner(System.in);

        System.out.print("Ürün Fiyatını Giriniz : ");

        tutar = input.nextDouble();

        double kdvOran = (tutar > 1000) ? 0.08 : 0.18;
        double kdvtutar = tutar * kdvOran;
        double kdvlitutar = tutar + kdvtutar;

        System.out.println("KDV Oranı : " + kdvOran);
        System.out.println("KDV Tutar : " + kdvtutar);
        System.out.println("KDV'li Tutar : " + kdvlitutar);

    }
}