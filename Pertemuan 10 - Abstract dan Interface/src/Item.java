public abstract class Item {
    private String nama;
    private int rank;
    private  int price;

    public Item(String nama, int rank, int price) {
        this.nama = nama;
        this.rank = rank;
        this.price = price;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
