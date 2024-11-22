package MaceraOyunu;

public class ToolStore extends NormalLocation {

    //ToolStore sınıfı, oyuncunun mağaza konumunu temsil eden bir sınıftır.
    //Silahlar ve zırhlar satın alınabilir.
    public ToolStore(Player player) {
        super(player, "Mağaza");
    }

    //Mağaza konumunda gerçekleşen olayları işleyen metot.
    //Silahlar ve zırhlar satın alınabilir.
    @Override
    public boolean onLocation() {
        boolean showMenu = true;
        while (showMenu) {
            System.out.println("-----------Mağazaya Hoşgeldiniz-------- ");
            System.out.println("1- Silahlar");
            System.out.println("2- Zırhlar");
            System.out.println("3- Çıkış yap");
            System.out.print("Seçiminiz : ");
            int selectCase = scan.nextInt();
            while (selectCase < 1 || selectCase > 3) {
                System.out.print("Geçersiz değer, tekrar giriniz :  ");
                selectCase = scan.nextInt();
            }
            switch (selectCase) {
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("Tekrar bekleriz");
                    showMenu = false;
                    break;

            }

        }
        return true;
    }

    //Mağazadaki silahları listeleyen metot.
    public void printWeapon() {
        System.out.println("-----------Silahlar-----------");
        for (Weapon w : Weapon.weapons()) {
            System.out.println(w.getId() + "- " + w.getName() + " Para : " + w.getPrice() + " Hasar : " + w.getDamage());
        }
        System.out.println("0 - Çıkış Yap");
    }

    //Oyuncunun silah satın almasını sağlayan metot.
    public void buyWeapon() {
        System.out.print("Bir silah seçiniz : ");
        int selectWeaponID = scan.nextInt();
        while (selectWeaponID < 0 || selectWeaponID > Weapon.weapons().length) {
            System.out.print("Geçersiz değer, tekrar giriniz : ");
            selectWeaponID = scan.nextInt();
        }

        if (selectWeaponID != 0) {
            Weapon selectedWeapon = Weapon.getWeaponObjByID(selectWeaponID);


            if (selectedWeapon != null) {
                if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yeterli paranız bulunmamaktadır.");
                } else {
                    //Silah satın alma gerçekleşmesi
                    System.out.println(selectedWeapon.getName() + " silahını satın aldınız.");
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan paranız : " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                }
            }
        }


    }

    //Mağazadaki zırhları listeleyen metot.
    public void printArmor() {
        System.out.println("-----------Zırhlar-----------");
        for (Armor a : Armor.armors()) {
            System.out.println(a.getId() + " - " + a.getName() + " Para : " + a.getPrice() + " Defans : " + a.getDefence());
        }
        System.out.println("0 - Çıkış Yap");

    }


    //Oyuncunun zırh satın almasını sağlayan metot.
    public void buyArmor() {
        System.out.print("Bir zırh seçiniz : ");
        int selectArmorID = scan.nextInt();
        while (selectArmorID < 0 || selectArmorID > Armor.armors().length) {
            System.out.print("Geçersiz değer, tekrar giriniz : ");
            selectArmorID = scan.nextInt();
        }

        if (selectArmorID != 0) {
            Armor selectedArmor = Armor.getArmorObjByID(selectArmorID);

            if (selectedArmor != null) {
                if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yeterli paranız bulunmamaktadır.");
                } else {
                    // Zırh satın alma gerçekleşmesi
                    System.out.println(selectedArmor.getName() + " zırhını satın aldınız.");
                    int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan paranız : " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                }
            }
        }

    }
}