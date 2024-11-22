package MethodOverriding_polimorfizm_abstraction;

public class Main {
    public static void main(String[] args) {
        Calisan calisan = new Calisan("Betül Salim");
        //parametrelere göre methodları anlıyor Method Overloading (Methodlara aşırı yüklenme)
        calisan.giris();
        calisan.giris("10:00");

       // Akademisyen akademisyen = new Akademisyen("Betül Salim");
       // akademisyen.giris();

        OgretimGorevlisi ogretimGorevlisi = new OgretimGorevlisi("Burak Salim");
        ogretimGorevlisi.giris();

       // Memur memur = new Memur("Burak Salim");
       // memur.giris();
        //polimorfizm (çok biçimlilik) override edilmiş nesnelere erişiliyor sadece yani ortak olanlara
       // Calisan calisan1 = new Akademisyen("Kodluyoruz");
        //calisan1 akademisyen gibi davrancak
        //calisan1.giris();

        //int[] loginUser = new int[5]; //array
       // Calisan[] loginUser = {akademisyen, ogretimGorevlisi, memur, calisan};
        //Calisan.loginUsers(loginUser);

        ogretimGorevlisi.derseGir("10:00");


    }
}
