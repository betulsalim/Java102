package Interface;

public class ABank implements IBank{
    private String bankName;
    private String TerminalId;
    private String bankPassword;

    public ABank(String bankName, String TerminalId, String bankPassword) {
        this.bankName = bankName;
        this.TerminalId = TerminalId;
        this.bankPassword = bankPassword;
    }
    @Override
    public boolean connectToBank(String ipAdress) {
        System.out.println("Kullanıcı ip: " + ipAdress);
        System.out.println("Makina ip: " + this.hostIpAddress);
        System.out.println(this.bankName + "Connecting to the Bank");
        return true;
    }
    @Override
    public boolean payment(double price, String cardNo, String expireDate, String cvc) {
        System.out.println("Bankadan cevap bekleniyor");
        System.out.println("İşlem Başarılı!");
        return true;
    }

    public String getBankName() {return bankName;}
    public void setBankName(String bankName) {this.bankName = bankName;}
    public String getTerminalId() {return TerminalId;}
    public void setTerminalId(String TerminalId) {this.TerminalId = TerminalId;}
    public String getBankPassword() {return bankPassword;}
    public void setBankPassword(String bankPassword) {this.bankPassword = bankPassword;}

}
