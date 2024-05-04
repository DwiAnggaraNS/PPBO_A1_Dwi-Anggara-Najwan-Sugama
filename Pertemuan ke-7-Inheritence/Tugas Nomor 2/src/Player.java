public class Player extends Entity{
    private String name;

    public Player(int level, int hp, String name) {
        super(level, hp);
        this.name = name;
    }

    @Override
    public void entityInfo() {
        System.out.println("# PLAYER" +" DENGAN NAMA : " + this.name+", DAN LEVEL : "+super.getLevel());
    }

    public void interact(Merchant merchant){
        if (super.getHp() > 0 && merchant.getHp() > 0 && !merchant.isAttacked()){
            System.out.println("Merchant : ");
            System.out.println("Barang yang tersedia hari ini : ");
            for (String item: merchant.getListItem()){
                System.out.println("# "+item);
            }
        } else if (super.getHp() <=0) {
            System.out.println("# PLAYER SUDAH MATI");
        }else if (merchant.getHp() <=0) {
            System.out.println("# MERCHANT SUDAH MATI");
        } else if (merchant.isAttacked()) {
            System.out.println("merchant : Dah lah males jualan");
            System.out.println(" # TIDAK BISA BELI, MERCHANT NGAMBEK");
        } else{
            System.out.println("# KEDUANYA SUDAH MATI");
        }
    }

    public void attack(Zombie zombie){
        if (super.getHp() <= 0) {
            System.out.println("# PLAYER SUDAH MATI");
            return;
        }

        if (zombie.getHp() <= 0) {
            System.out.println("# ZOMBIE SUDAH MATI");
            return;
        }

        zombie.setHp(zombie.getHp() - 10);
        System.out.println("zombie : GRAAA!");

        if (zombie.getHp() <= 0) {
            System.out.println("# ZOMBIE MATI");
        }
    }


    public void attack(Merchant merchant){
        if (super.getHp() <= 0) {
            System.out.println("# PLAYER SUDAH MATI");
            return;
        }

        if (merchant.getHp() <= 0) {
            System.out.println("MERCHANT SUDAH MATI");
            return;
        }

        merchant.setHp(merchant.getHp() - 10);
        merchant.setAttacked(true);
        System.out.println("merchant : hey heyy, ngapain nyerang");

        if (merchant.getHp() <= 0) {
            System.out.println("# MERCHANT MATI");
        }
    }
}
