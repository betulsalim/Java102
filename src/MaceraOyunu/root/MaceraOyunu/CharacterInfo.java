package MaceraOyunu;

public abstract class CharacterInfo {
    private int id; // Karakterin benzersiz kimliğini tutan değişken
    private String name; // Karakterin adını tutan değişken
    private int damage; // Karakterin verdiği hasarı tutan değişken
    private int health; // Karakterin sağlık puanını tutan değişken
    private int money; // Karakterin sahip olduğu para miktarını tutan değişken

    public CharacterInfo(int id, String name, int damage, int health, int money) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.money = money;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}