public class Entity {
    private int hp;
    private int level;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Entity(int level, int hp) {
        this.level = level;
        this.hp = hp;
    }

    public void entityInfo(){
    }
}
