public class Potion  extends Item implements iAttack{

    public enum Tipe{
        ATTACK, HEAL
    }

    private int duration;
    private int effect_point;
    private Tipe tipePotion;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getEffect_point() {
        return effect_point;
    }

    public void setEffect_point(int effect_point) {
        this.effect_point = effect_point;
    }

    public Tipe getTipePotion() {
        return tipePotion;
    }

    public void setTipePotion(Tipe tipePotion) {
        this.tipePotion = tipePotion;
    }

    public Potion(String nama, int rank, int price, int duration, int effect_point, Tipe tipePotion) {
        super(nama, rank, price);
        this.duration = duration;
        this.tipePotion = tipePotion;
        this.effect_point = effect_point;
    }

    public void usePotion(){
        if (this.tipePotion.equals(Tipe.ATTACK)){
            this.attack();
        } else if (this.tipePotion.equals(Tipe.HEAL)) {
            System.out.println("Healed by "+this.effect_point);
        }
    }

    @Override
    public void attack() {
        System.out.println("Damage dealt by "+this.effect_point);
    }
}