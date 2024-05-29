public class Shield extends Item{
    private int damage_block;

    public int getDamage_block() {
        return damage_block;
    }

    public void setDamage_block(int damage_block) {
        this.damage_block = damage_block;
    }

    public Shield(String nama, int rank, int price, int damage_block) {
        super(nama, rank, price);
        this.damage_block = damage_block;
    }

    public void defense(){
        System.out.println("Damage Mitigated by "+this.damage_block);
    }
}
