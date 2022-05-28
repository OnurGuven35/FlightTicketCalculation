import java.util.Scanner;

public class Flight {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int km, age, tip;
        double tutar, ds1, ds2, ds3, son;

        System.out.print("Mesafeyi Km Cinsinden Giriniz : ");
        km = inp.nextInt();
        System.out.print("Yasinizi Giriniz : ");
        age = inp.nextInt();
        System.out.print("1-Tek Yon \n2-Gidis Donus \nYolculuk Tipini Giriniz : ");
        tip = inp.nextInt();

        tutar = km * 0.10;
        ds1 = (tutar * 0.50);
        ds2 = (tutar * 0.10);
        ds3 = (tutar * 0.30);

        if (tip == 1 && km > 0 && age > 0) {
            if (age < 12) {
                son = (ds1);
                System.out.print("Toplam Tutar : " + son + "TL");
            } else if (age <= 24) {
                son = (tutar - ds2);
                System.out.print("Toplam Tutar : " + son + "TL");
            } else if (age <= 65) {
                son = (tutar);
                System.out.print("Toplam Tutar : " + son + "TL");
            } else if (age >= 66) {
                son = (tutar - ds3);
                System.out.print("Toplam Tutar : " + son + "TL");
            } else {
                System.out.print("Hatali Giris Yaptiniz Lutfen Tekrar Deneyiniz !!! ");
            }
        } else if (tip == 2 && km > 0 && age > 0) {
            if (age < 12) {
                son = 2 * ((ds1) - ((ds1) * 0.20));
                System.out.print("Toplam Tutar : " + son + "TL");
            } else if (age <= 24) {
                son = 2 * ((tutar - ds2) - ((tutar - ds2) * 0.20));
                System.out.print("Toplam Tutar : " + son + "TL");
            } else if (age <= 65) {
                son = 2 * (tutar - (tutar * 0.20));
                System.out.print("Toplam Tutar : " + son + "TL");
            } else if (age >= 66) {
                son = 2 * ((tutar - ds3) - ((tutar - ds3) * 0.20));
                System.out.print("Toplam Tutar : " + son + "TL");
            } else {
                System.out.print("Hatali Giris Yaptiniz Lutfen Tekrar Deneyiniz !!! ");
            }
        } else {
            System.out.print("Hatali Giris Yaptiniz Lutfen Tekrar Deneyiniz !!! ");
        }
    }
}
