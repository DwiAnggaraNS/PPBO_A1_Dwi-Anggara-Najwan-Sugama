import java.util.ArrayList;

public class Keranjang {
    ArrayList<Barang> listBarang;
    int jumlahBarang = 0;
    int hargaTotalBarang = 0;

    public Keranjang() {
        this.listBarang = new ArrayList<Barang>();
    }

    void tambahBarang(Barang barang){
        boolean result = (this.jumlahBarang + barang.jumlah <= 5) ? true : false;

        if (result == true){
            listBarang.add(barang);
            System.out.println("Berhasil memasukkan ke keranjang");
            this.jumlahBarang += barang.jumlah;
            this.hargaTotalBarang += (barang.harga * barang.jumlah);
        }else {
            System.out.println("Keranjang sudah penuh!");
        }
    }

    void printHasil(){
        System.out.println("Jumlah Barang di Keranjang Saat ini: "+this.jumlahBarang);
        System.out.println("Barang Pada Keranjang:");
        for (Barang barang: listBarang){
            System.out.println("# "+barang.nama+", jumlah : "+barang.jumlah);
        }
        System.out.println("Total Harga yang Harus Dibayar : "+this.hargaTotalBarang);
    }


}
