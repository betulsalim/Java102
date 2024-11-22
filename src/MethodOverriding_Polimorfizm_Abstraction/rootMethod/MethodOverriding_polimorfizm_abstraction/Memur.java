package MethodOverriding_polimorfizm_abstraction;

public abstract class Memur extends Akademisyen{
    private String adSoyad;
    public Memur(String adSoyad) {
        super(adSoyad);
        this.adSoyad = adSoyad;
    }
    public String getAdSoyad() {return adSoyad;}
    public void setAdSoyad(String adSoyad) {this.adSoyad = adSoyad;}
    @Override
    public void giris(){
        System.out.println(this.getAdSoyad()+ " Çalışan C kapısından giriş yaptı");
    }
}
