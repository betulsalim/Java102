package Interface;

public interface IBank {
    final String hostIpAddress = "127.0.0.1";
    boolean connectToBank(String ipAdress);
    boolean payment(double price, String cardNo, String expireDate, String cvc);
}
