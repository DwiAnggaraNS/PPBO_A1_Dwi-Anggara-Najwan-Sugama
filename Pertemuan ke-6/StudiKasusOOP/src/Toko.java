import java.util.ArrayList;
public class Toko {
    public enum Type {
        MEJA,
        KURSI,
        LEMARI
    }
    private ArrayList<Pembeli> listPembeli = new ArrayList<Pembeli>();
    private Gudang gudangBarang = new Gudang();

    public Gudang getGudangBarang() {
        return gudangBarang;
    }

    private boolean antrianPenuh(){
        return listPembeli.size() > 4;
    }
    public void tambahAntrian(Pembeli pembeli){
        if (!this.antrianPenuh()){
            listPembeli.add(pembeli);
            System.out.println("Berhasil menambahkan pembeli ke antrian\n");
        }else{
            System.out.println("Antrian sudah penuh!\n");
        }
    }
    public void cekIsiAntrian(){
        System.out.println("LIST ANTRIAN : ");
        for (int i = 0; i<listPembeli.size(); i++){
            System.out.println("antrian ke "+(i+1)+", nama : "+listPembeli.get(i).getNama()+", barang dibeli "+ listPembeli.get(i).getBarangDiBeli()+", jumlah barang dibeli : "+listPembeli.get(i).getJumlahBarang());
        }
        System.out.println();
    }

    private boolean barangDibeliTersedia(Toko.Type barang, int jumlah_barang){
        if (gudangBarang.isiGudang.containsKey(barang)){
            int stok = gudangBarang.isiGudang.get(barang);
            return stok >= jumlah_barang;
        }else{
            return false;
        }
    }
    public void selesaikanAntrian(){
        Toko.Type barang = listPembeli.getFirst().getBarangDiBeli();
        int jumlah_barang = listPembeli.getFirst().getJumlahBarang();
        if (!listPembeli.isEmpty() && this.barangDibeliTersedia(barang, jumlah_barang)){
            gudangBarang.keluakanBarangDariGudang(barang, jumlah_barang);
            listPembeli.removeFirst();
            System.out.println("antrian terdepan berhasil diselesaikan\n");
        } else{
            System.out.println("Antrian gagal diselesaikan\n");
        }
    }
}
