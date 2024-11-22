package MethodOverriding_polimorfizm_abstraction;

public class OgretimGorevlisi extends Akademisyen{
    private String adSoyad;

    public OgretimGorevlisi(String adSoyad) {
        super(adSoyad);
        this.adSoyad = adSoyad;
    }
    public String getAdSoyad() {return adSoyad;}
    public void setAdSoyad(String adSoyad) {this.adSoyad = adSoyad;}

    @Override
    public void giris(){
        System.out.println(this.getAdSoyad() + " Öğretim Görevlisi B kapısından giriş yaptı.");
    }
    @Override
    public void derseGir(String saat){
        System.out.println(this.getAdSoyad() + " Öğretim Görevlisi Derse " + saat + " saatinde Giriş Yaptı!");
    }
}
