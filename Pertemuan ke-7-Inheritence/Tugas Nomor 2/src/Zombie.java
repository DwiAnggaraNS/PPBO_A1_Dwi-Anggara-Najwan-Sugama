public class Zombie extends Entity{

    public enum Types{
        MELEE, RANGED
    }

    private Types types;

    public Zombie(int level, int  hp, Types types) {
        super(level, hp);
        this.types = types;
    }

    @Override
    public void entityInfo() {
        System.out.println("# ZOMBIE" +" DENGAN TIPE : " + this.types+", DAN LEVEL : "+super.getLevel());
    }

    public void attack(Player player) {
        if (super.getHp() <= 0) {
            System.out.println("# ZOMBIE SUDAH MATI");
            return;
        }

        int damage = (this.types == Types.MELEE) ? 20 : 15;
        player.setHp(player.getHp() - damage);
        System.out.println("player : UGHH");

        if (player.getHp() <= 0) {
            System.out.println("# YOU DIE, GAME OVER");
        }
    }
}
