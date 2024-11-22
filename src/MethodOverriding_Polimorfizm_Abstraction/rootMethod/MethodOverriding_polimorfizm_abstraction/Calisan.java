package MethodOverriding_polimorfizm_abstraction;

public class Calisan {
    private String adSoyad;

    public Calisan(String adSoyad) {
        this.adSoyad = adSoyad;
    }
    public String getAdSoyad() {return adSoyad;}
    public void setAdSoyad(String adSoyad) {this.adSoyad = adSoyad;}

    public void giris(String girisSaati){
        System.out.println(this.getAdSoyad() + " " + girisSaati + " saatinde giriş yaptı");
    }
    public void giris(){
        System.out.println(this.getAdSoyad() + " giriş yaptı");
    }

    //polimorfizm
    public static void loginUsers (Calisan[] loginUsers){
        for (Calisan loginUser : loginUsers) {
            loginUser.giris();
        }
    }

}
