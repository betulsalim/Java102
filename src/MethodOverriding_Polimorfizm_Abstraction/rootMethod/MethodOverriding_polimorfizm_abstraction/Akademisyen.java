package MethodOverriding_polimorfizm_abstraction;

public abstract class Akademisyen extends Calisan{
    private String adSoyad;

    public Akademisyen(String adSoyad) {
        super(adSoyad);
        this.adSoyad = adSoyad;

    }
    public String getAdSoyad() {return adSoyad;}
    public void setAdSoyad(String adSoyad) {this.adSoyad = adSoyad;}
    //abstract yaptığında metodu override etmek zorundasın.
    public abstract void derseGir(String dersSaati);
    @Override
    public void giris(){
        System.out.println(this.getAdSoyad() + " Akademisyeni A kapısından giriş yaptı");
    }
}
