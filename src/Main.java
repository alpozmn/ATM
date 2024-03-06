import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Başlangıç bakiyesi
        double bakiye = 1500.0;

        while (true) {
            // Menüyü göster
            System.out.println("\n1. Bakiye sorgula");
            System.out.println("2. Para yatır");
            System.out.println("3. Para çek");
            System.out.println("4. Çıkış yap");
            System.out.print("Seçiminiz: ");

            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("Bakiyeniz: " + bakiye + " TL");
                    break;
                case 2:
                    System.out.print("Yatırmak istediğiniz miktarı girin: ");
                    double yatirilanMiktar = scanner.nextDouble();
                    if (yatirilanMiktar > 0) {
                        bakiye += yatirilanMiktar;
                        System.out.println(yatirilanMiktar + " TL yatırıldı.");
                    } else {
                        System.out.println("Geçersiz miktar girdiniz.");
                    }
                    break;
                case 3:
                    System.out.print("Çekmek istediğiniz miktarı girin: ");
                    double cekilenMiktar = scanner.nextDouble();
                    if (cekilenMiktar > 0 && cekilenMiktar <= bakiye) {
                        bakiye -= cekilenMiktar;
                        System.out.println(cekilenMiktar + " TL çekildi.");
                    } else {
                        System.out.println("Geçersiz miktar girdiniz veya bakiye yetersiz.");
                    }
                    break;
                case 4:
                    System.out.println("Çıkış yapılıyor...");
                    System.exit(0);
                default:
                    System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
            }
        }
    }
}
