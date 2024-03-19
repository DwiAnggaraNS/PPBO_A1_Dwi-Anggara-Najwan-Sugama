import java.util.ArrayList;

public class Keranjang {
//    Bagian I: inisiasi atribut dan constructor
    private int jmlBarang = 0;
    private int totalBerat = 0;


    private ArrayList<Barang> listBarang = new ArrayList<>();
    public Keranjang() {
    }

//  Bagian II: Method Getter dan Setter untuk setiap atribut
    public int getJmlBarang() {
        return jmlBarang;
    }
    public void setJmlBarang(int jmlBarang) {
        this.jmlBarang = jmlBarang;
    }
    public int getTotalBerat() {
        return totalBerat;
    }
    public void setTotalBerat(int totalBerat) {
        this.totalBerat = totalBerat;
    }
    public ArrayList<Barang> getListBarang() {
        return listBarang;
    }

    public void setListBarang(ArrayList<Barang> listBarang) {
        this.listBarang = listBarang;
    }

//    Bagian III: Method untuk menambahkan barang ke listBarang
    void tambahBarang(Barang barang){
        if(this.getJmlBarang()+barang.getJumlahBarang() <= 5){
            listBarang.add(barang);
            this.setJmlBarang(this.getJmlBarang()+barang.getJumlahBarang());
            System.out.println("Berhasil memasukan ke kranjang");
        }else{
            System.out.println("Wes too, Keranjange wes mbludhag!!");
        }

    }

//    Bagian IV: Method untuk menghitung total harga
    int totalHarga(){
        int harga = 0;
        for ( Barang barang: listBarang
        ) {
            harga += barang.getHargaBarang() * barang.getJumlahBarang();
        }
        return harga;
    }

//    Bagian V: Method untuk menampilkan hasil belanja
    void printHasil() {
        System.out.println( "Jumlah Barang Di Keranjang Saat Ini : " + this.getJmlBarang());
        System.out.println( "Barang Pada Keranjang: ");
        for (int i = 0; i<listBarang.size(); i++){
            System.out.println("# " + listBarang.get(i).getNamaBarang() + ", jumlah : " + listBarang.get(i).getJumlahBarang());
        }
        System.out.println("Total Harga Yang Harus di Bayar : " + totalHarga());
    }
}