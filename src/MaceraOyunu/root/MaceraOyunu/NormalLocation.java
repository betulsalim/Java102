package MaceraOyunu;

public abstract class NormalLocation extends Location {
    public NormalLocation(Player player, String name) {
        super(player, name);
    }


    // Normal konumda gerçekleşecek olayları işleyen metot.
    @Override
    public boolean onLocation() {
        return true;
    }
}


