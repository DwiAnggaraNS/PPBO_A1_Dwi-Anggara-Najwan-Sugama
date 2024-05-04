import java.util.ArrayList;

public class Merchant extends Entity{
    private boolean attacked = false;
    private ArrayList<String> listItem = new ArrayList<>();

    public boolean isAttacked() {
        return attacked;
    }

    public void setAttacked(boolean attacked) {
        this.attacked = attacked;
    }

    public ArrayList<String> getListItem() {
        return listItem;
    }

    public void setListItem(ArrayList<String> listItem) {
        this.listItem = listItem;
    }

    public Merchant(int level, int hp, ArrayList listItem) {
        super(level, hp);
        this.listItem = listItem;
    }

    @Override
    public void entityInfo() {
        System.out.println("# MERCHANT" +" DENGAN LEVEL : "+super.getLevel());
    }
}
