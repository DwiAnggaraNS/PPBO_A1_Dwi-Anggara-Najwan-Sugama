public class Sword extends Item implements  iAttack{
    private int damage;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Sword(String nama, int rank, int price, int damage) {
        super(nama, rank, price);
        this.damage = damage;
    }

    @Override
    public void attack() {
        System.out.println("Damage dealt by "+this.damage);
    }
}
