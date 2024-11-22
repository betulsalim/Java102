package MaceraOyunu;

public class Forest extends BattleLocation {
    // Forest sınıfı, BattleLoc sınıfından türetilmiştir, ormanın konumunu temsil eder
    public Forest(Player player) {
        // BattleLoc sınıfının kurucusunu çağırarak orman konumunu başlatır.
        // Bu konumda oyuncu vampirlerle savaşır ve ödül olarak odun kazanır.
        super(player,"Orman", new Vampire(),"odun",3);
    }

}
