
import java.util.Scanner;
/**
 *
 * @author AA
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calisan programina hosgeldiniz...");

        String islemler ="İşlemler:\n"
                + "1. Yazilimci islemleri\n"
                + "2. Yonetici islemleri\n"
                + "Cikis icin q ya basin";

        while (true) {
            System.out.println("*************");
            System.out.println(islemler);
            System.out.println("*************");

            System.out.print("isleminizi seciniz: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("Programdan cikiliyor.");
                break;
            }
            else if (islem.equals("1")){
                Yazilimci yazilimci1 = new Yazilimci ("Can", "Derin", 159, "Java, C");

                String yazilimci_islem = "1. Format at\n"
                        + "2. Bilgileri göster\n"
                        + "Cikis icin q ya basiniz";

                System.out.println("*************");
                System.out.println("** Yazilimci islemleri **");
                System.out.println(yazilimci_islem);
                System.out.println("*************");

                while (true) {
                    System.out.print("Yazilimci islemini seciniz: ");
                    String ya_islem = scanner.nextLine();

                    if (ya_islem.equals("q")){
                        System.out.println("Yazilimci islemlerinden cikiliyor.");
                        break;
                    }
                    else if (ya_islem.equals("1")){
                        System.out.print("isletim sistemi: ");
                        String isletim_sistemi = scanner.nextLine();
                        yazilimci1.formatAt(isletim_sistemi);

                    }
                    else if (ya_islem.equals("2")){
                        System.out.print("Yazilimci bilgileri: ");
                        yazilimci1.bilgileriGoster();
                    }

                    else {
                        System.out.println("Gecersiz yazilimci islemi");
                    }
                }
            }

            else if (islem.equals("2")){
                Yonetici yonetici1 = new Yonetici("Serhat", "Ay", 156, 10);
                String yonetici_islem = "Yonetici islemleri:\n"
                        + "1. Zam yap\n"
                        + "2. Bilgileri goster\n"
                        + "Cikis icin q ya basiniz";

                System.out.println("*************");
                System.out.println("** Yonetici islemleri **");
                System.out.println(yonetici_islem);
                System.out.println("*************");

                while (true) {
                    System.out.print("Yonetici islemini seciniz: ");
                    String yo_islem = scanner.nextLine();

                    if (yo_islem.equals("q")) {
                        System.out.println("Yonetici islemlerinden cikiliyor...");
                        break;
                    }
                    else if (yo_islem.equals("1")) {
                        System.out.print("Yoneticinin yapacagi sam miktari: ");
                        int zam_miktari = scanner.nextInt();
                        scanner.nextLine();
                        yonetici1.zamYap(zam_miktari);
                        System.out.println(yonetici1.getAd() + " " + yonetici1.getSoyad() + " " + zam_miktari + " zam yapti MAiN");

                    }
                    else if (yo_islem.equals("2")) {
                        yonetici1.bilgileriGoster();

                    }
                    else {
                        System.out.println("Gecersiz yonetici islemi");
                    }
                }
            }

            else {
                System.out.println("Gecersiz islem");
            }
        }
    }
}
