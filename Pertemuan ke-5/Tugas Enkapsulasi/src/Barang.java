import java.util.ArrayList;

public class Barang {
//  Bagian I: Atribut
    private String namaBarang;
    private int hargaBarang;
    private int jumlahBarang;
    public Barang() {
    }

//  Bagian II: Method Getter dan Setter untuk setiap atribut
    public int getJumlahBarang() {
        return jumlahBarang;
    }
    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }
    public int getHargaBarang() {
        return hargaBarang;
    }
    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang = hargaBarang;
    }
    public String getNamaBarang() {
        return namaBarang;
    }
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }
}

