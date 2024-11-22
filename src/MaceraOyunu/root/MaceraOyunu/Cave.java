package MaceraOyunu;

public class Cave extends BattleLocation{

    // Cave sınıfı, BattleLoc sınıfından türetilmiştir, mağara konumunu temsil eder
    public Cave(Player player) {
        // BattleLoc sınıfının kurucusunu çağırarak mağara konumunu başlatır.
        // Bu konumda oyuncu zombilerle savaşır ve ödül olarak yemek kazanır.
        super(player,"Mağara",new Zombie(),"Yemek",3);
    }
}