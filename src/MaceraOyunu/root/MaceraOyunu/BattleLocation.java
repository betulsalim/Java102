package MaceraOyunu;

import java.util.Random;
import java.util.Scanner;

//BattleLoc sınıfı, savaş alanlarını temsil eden soyut bir sınıftır.
//Bu sınıf, oyuncunun canavarlarla savaştığı ve ödüller kazandığı özel bir konum türünü tanımlar.
public abstract class BattleLocation extends Location {
    private Monster monster; // Savaş alanındaki canavarı temsil eden değişken
    private String award; // Savaş sonrası kazanılacak ödülün adını tutan değişken
    private int maxMonster; // Savaş alanındaki maksimum canavar sayısını belirten değişken
    public Random random = new Random();


    public BattleLocation(Player player, String name, Monster monster, String award, int maxMonster) {
        super(player, name);
        this.monster = monster;
        this.award = award;
        this.maxMonster = maxMonster;
    }


    //BattleLoc sınıfının üzerine yazılmış olan soyut metot.
    //Bu metot, savaş alanındaki olayları işler ve savaşın sonucunu belirler.

    Scanner scan = new Scanner(System.in);
    @Override
    public boolean onLocation() {
        int monstNumber = this.randomMonsterNumber();
        System.out.println("Şuan buradasınız : " + this.getName());
        System.out.println("Dikkatli ol, burada " + monstNumber + " tane " + this.getMonster().getName() + " yaşıyor.");
        System.out.print("Savaşmak için <S> harfine bas, Kaçmak için <K> harfine bas : ");
        String selectBattle = scan.nextLine().toUpperCase();
        if (selectBattle.equals("S") && combat(monstNumber)) {
            System.out.println(this.getName() + " bölgesinin tüm düşmanları öldürdünüz.");
            return true;
        }

        if (this.getPlayer().getHealth() <= 0) {
            System.out.println("Öldünüz.");
            return false;
        }
        return true;
    }

    // Oyuncunun canavalarla savaştığı metot
    public boolean combat(int monstNumber) {

        for (int i = 1; i <= monstNumber; i++) {
            this.getMonster().setHealth(this.getMonster().getOrginalHealth());
            playerStats();
            monsterStats(i);

            boolean playerFirst = Math.random() > 0.5;
            while (this.getPlayer().getHealth() > 0 && this.getMonster().getHealth() > 0) {
                System.out.println();
                System.out.print("<V>ur veya <K>aç : ");
                String selectCombat = scan.nextLine().toUpperCase();

                if (playerFirst) {
                    if (selectCombat.equals("V")) {
                        System.out.println(this.getPlayer().getName() + " vurdu.");
                        this.monster.setHealth(this.monster.getHealth() - this.getPlayer().getTotalDamage());
                        afterHit();

                    } else {
                        return false;
                    }
                } else {
                    if (this.getMonster().getHealth() > 0) {
                        System.out.println();
                        System.out.println(this.getMonster().getName() + " size vurdu.");
                        int monsterDamage = this.getMonster().getDamage() - this.getPlayer().getInventory().getArmor().getDefence();
                        if (monsterDamage < 0) {
                            monsterDamage = 0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - monsterDamage);
                        afterHit();
                        if (this.getPlayer().getHealth() <= 0) {
                            System.out.println("Öldünüz.");
                            return false;
                        }

                    }
                }
            }
            if (this.getMonster().getHealth() < this.getPlayer().getHealth()) {
                int count = 0;
                System.out.println("Düşmanı yendiniz.");
                System.out.println(this.getMonster().getAwardMoney() + " para kazandınız.");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getMonster().getAwardMoney());
                System.out.println("Güncel paranız : " + this.getPlayer().getMoney());
                if (i == monstNumber && this.getMonster().getName().equals("Zombi")) {
                    this.getPlayer().getInventory().setFood(true);
                    count++;
                    System.out.println("Tebrikler yemek kazandınız.");
                    this.getPlayer().getInventory().setFoodCount(count);
                } else if (i == monstNumber && this.getMonster().getName().equals("Vampir")) {
                    this.getPlayer().getInventory().setFireWood(true);
                    count++;
                    System.out.println("Tebrikler odun kazandınız.");
                    this.getPlayer().getInventory().setFireWoodCount(count);
                } else if (i == monstNumber && this.getMonster().getName().equals("Ayı")) {
                    this.getPlayer().getInventory().setWater(true);
                    count++;
                    System.out.println("Tebrikler su kazandınız.");
                    this.getPlayer().getInventory().setWaterCount(count);

                } else if (i == monstNumber && this.getMonster().getName().equals("Yılan")) {
                    getSnake();
                }
            }


        }
        return true;
    }

    //Her vuruş sonrasında ekrana canavar ve oyuncunun güncel sağlık durumlarını yazdıran metot.

    public void afterHit() {
        System.out.println("Canınız : " + this.getPlayer().getHealth());
        System.out.println(this.getMonster().getName() + " canı : " + this.getMonster().getHealth());
        System.out.println("------------");
    }


    //Oyuncunun genel istatiklerini ekrana yazdıran metot.
    public void playerStats() {
        System.out.println("Oyuncu değerleri : ");
        System.out.println("------------");
        System.out.println("Sağlık : " + this.getPlayer().getHealth());
        System.out.println("Silah : " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Zırh : " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Bloklama : " + this.getPlayer().getInventory().getArmor().getDefence());
        System.out.println("Toplam Hasar : " + this.getPlayer().getTotalDamage());
        System.out.println("Para : " + this.getPlayer().getMoney());
        System.out.println();


    }

    // Canavarın genel özelliklerini ekrana yazdıran metot.

    public void monsterStats(int i) {
        System.out.println(i + ". " + this.getMonster().getName() + " Değerleri");
        System.out.println("-------------------");
        System.out.println("Sağlık : " + this.getMonster().getHealth());
        System.out.println("Hasar : " + this.getMonster().getDamage());
        System.out.println("Para Ödülü : " + this.getMonster().getAwardMoney());
    }

    //Bölgede çıkacak olan canavarların random değerini atama.
    public int randomMonsterNumber() {
        Random r = new Random();
        return r.nextInt(this.getMaxMonster()) + 1;
    }

    public void getSnake() {
        int randomNumber = random.nextInt(100);
        if (randomNumber <= 15) {
            //Silah kazanma durumu
            weaponRate();
        } else if (randomNumber <= 30) {
            //Zırh kazanma durumu
            armorRate();
        } else if (randomNumber <= 55) {
            //Para kazanma durumu
            moneyRate();
        } else {
            System.out.println("Hiç birşey kazanamadınız.");
        }
    }

    public void weaponRate() {
        int randomNum = random.nextInt(1, 101);
        if (randomNum <= 50) {
            System.out.println("Tabanca kazandınız.");
            this.getPlayer().getInventory().setWeapon(Weapon.getWeaponObjByID(1));
        } else if (randomNum <= 80) {
            System.out.println("Kılıç kazandınız.");
            this.getPlayer().getInventory().setWeapon(Weapon.getWeaponObjByID(2));
        } else if (randomNum <= 100) {
            System.out.println("Tüfek kazandınız.");
            this.getPlayer().getInventory().setWeapon(Weapon.getWeaponObjByID(3));
        }
    }

    public void armorRate() {
        int randomNum = random.nextInt(1, 101);
        if (randomNum <= 50) {
            System.out.println("Hafif zırh kazandınız.");
            this.getPlayer().getInventory().setArmor(Armor.getArmorObjByID(1));
        } else if (randomNum <= 80) {
            System.out.println("Orta zırh kazandınız.");
            this.getPlayer().getInventory().setArmor(Armor.getArmorObjByID(2));
        } else if (randomNum <= 100) {
            System.out.println("Ağır zırh kazandınız.");
            this.getPlayer().getInventory().setArmor(Armor.getArmorObjByID(3));
        }
    }

    public void moneyRate() {
        int randomNum = random.nextInt(1, 101);
        int money = 0;
        if (randomNum <= 50) {
            money = 1;
            System.out.println("1 para kazandınız.");
            this.getPlayer().setMoney(getPlayer().getMoney() + money);

        } else if (randomNum <= 80) {
            money = 5;
            System.out.println("5 para kazandınız.");
            this.getPlayer().setMoney(getPlayer().getMoney() + money);
        } else if (randomNum <= 100) {
            money = 10;
            System.out.println("10 para kazandınız.");
            this.getPlayer().setMoney(getPlayer().getMoney() + money);
        }
    }


    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxMonster() {
        return maxMonster;
    }

    public void setMaxMonster(int maxMonster) {
        this.maxMonster = maxMonster;
    }

}