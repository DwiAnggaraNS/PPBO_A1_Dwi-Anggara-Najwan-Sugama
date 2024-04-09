public class Pembeli {

    private String nama;
    private Toko.Type barangDiBeli;
    private int jumlahBarang;
    public Pembeli(String nama, Toko.Type barangDiBeli, int jumlahBarang) {
        this.nama = nama;
        this.barangDiBeli = barangDiBeli;
        this.jumlahBarang = jumlahBarang;
    }
    public String getNama() {
        return nama;
    }

    public Toko.Type getBarangDiBeli() {
        return barangDiBeli;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

}
