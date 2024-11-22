package Interface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String terminalId="12312312312";
        final String password ="224412312";
        Scanner sc = new Scanner(System.in);

        System.out.println("Kart numarasını Giriniz: ");
        String cardNo = sc.nextLine();
        System.out.println("son kullanım tarihini Giriniz: ");
        String expireDate = sc.nextLine();
        System.out.println("Güvenlik kodunu Giriniz: ");
        String cvc = sc.nextLine();
        System.out.println("Tutar Giriniz: ");
        double price = sc.nextDouble();
        System.out.println("1. A bankası");
        System.out.println("2. B bankası");
        System.out.println("3. C bankası");

        int selectBank = sc.nextInt();
        switch (selectBank) {
            case 1:
                ABank aBank = new ABank("A Bankası",terminalId,password);
                aBank.connectToBank("127.1.1.1");
                aBank.payment(price,cardNo,expireDate,cvc);
                break;
            case 2:
                BBank bBank = new BBank("B bankası", terminalId, password);
                bBank.connectToBank("127.2.2.2");
            default:
                System.out.println("Geçerli Banka giriniz");

        }
    }
}
