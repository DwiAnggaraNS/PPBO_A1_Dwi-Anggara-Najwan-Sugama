import javax.xml.transform.stream.StreamSource;
import java.util.HashMap;
import java.util.Map;

public class Gudang {
    public enum Bahan {
        KAYU,
        BAUT,
        CAT
    }
    public HashMap<Toko.Type, Integer> isiGudang = new HashMap<>();
    public HashMap<Bahan, Integer> stokBahan = new HashMap<>();

    {
        isiGudang.put(Toko.Type.MEJA, 0);
        isiGudang.put(Toko.Type.KURSI, 0);
        isiGudang.put(Toko.Type.LEMARI, 0);

        stokBahan.put(Bahan.KAYU, 0);
        stokBahan.put(Bahan.BAUT, 0);
        stokBahan.put(Bahan.CAT, 0);
    }

    public void tambahBahan(Bahan inputBahan, int jumlah_barang){
        stokBahan.put(inputBahan, (stokBahan.get(inputBahan)+jumlah_barang));
    }

    public void kurangiBahan(Bahan inputBahan, int jumlah_barang){
        stokBahan.put(inputBahan, (stokBahan.get(inputBahan)-jumlah_barang));
    }

    public Bahan cekStokBahan(){
        System.out.println("STOK BAHAN:");
        for (Map.Entry<Bahan, Integer> entry : stokBahan.entrySet()) {
            System.out.println("Jumlah : " + entry.getKey() + ", saat ini adalah : " + entry.getValue()+" buah");
        }
        System.out.println();
        return null;
    }

    public Toko.Type cekIsiGudang(){
        System.out.println("ISI GUDANG:");
        for (Map.Entry<Toko.Type, Integer> entry : isiGudang.entrySet()) {
            System.out.println("Jumlah : " + entry.getKey() + ", saat ini adalah : " + entry.getValue()+" buah");
        }
        System.out.println();
        return null;
    }

    public boolean bahanPembuatanMencukupi(Toko.Type tipe_barang, int jumlah_barang){
        if (tipe_barang == Toko.Type.MEJA){
            return this.stokBahan.get(Bahan.KAYU)-(3*jumlah_barang) >= 0 && this.stokBahan.get(Bahan.BAUT)-(20*jumlah_barang) >= 0 && this.stokBahan.get(Bahan.CAT)-(2*jumlah_barang) >= 0;
        } else if (tipe_barang == Toko.Type.KURSI) {
            return this.stokBahan.get(Bahan.KAYU)-(2*jumlah_barang) >= 0 && this.stokBahan.get(Bahan.BAUT)-(10*jumlah_barang) >= 0 && this.stokBahan.get(Bahan.CAT)-(jumlah_barang) >= 0;
        } else if (tipe_barang == Toko.Type.LEMARI) {
            return this.stokBahan.get(Bahan.KAYU)-(5*jumlah_barang) >= 0 && this.stokBahan.get(Bahan.BAUT)-(30*jumlah_barang) >= 0 && this.stokBahan.get(Bahan.CAT)-(3*jumlah_barang) >= 0;
        }
        return false;
    }

    public boolean slotTersedia(Toko.Type tipe_barang, int jumlah_barang){
        if (tipe_barang == Toko.Type.MEJA){
            return isiGudang.get(Toko.Type.MEJA) + jumlah_barang <= 10;
        } else if (tipe_barang == Toko.Type.KURSI){
            return isiGudang.get(Toko.Type.KURSI) + jumlah_barang <= 20;
        } else if (tipe_barang == Toko.Type.LEMARI){
            return isiGudang.get(Toko.Type.LEMARI) + jumlah_barang <= 5;
        }
        return false;
    }

    public void masukkanBarangKeGudang(Toko.Type tipe_barang, int jumlah_barang){
        isiGudang.put(tipe_barang, isiGudang.get(tipe_barang)+jumlah_barang);
    }
    public void keluakanBarangDariGudang(Toko.Type tipe_barang, int jumlah_barang) {
        isiGudang.put(tipe_barang, (isiGudang.get(tipe_barang)-jumlah_barang));
        System.out.println(jumlah_barang+" "+tipe_barang+" berhasil dikeluarkan dari gudang");
    }
    public void buatBarang(Toko.Type tipe_barang, int jumlah_barang){
        if (this.bahanPembuatanMencukupi(tipe_barang,jumlah_barang) && this.slotTersedia(tipe_barang, jumlah_barang)){
            if (tipe_barang == Toko.Type.MEJA){
                this.kurangiBahan(Bahan.KAYU, 3*jumlah_barang);
                this.kurangiBahan(Bahan.BAUT, 20*jumlah_barang);
                this.kurangiBahan(Bahan.CAT, 2*jumlah_barang);
            }else if (tipe_barang == Toko.Type.KURSI){
                this.kurangiBahan(Bahan.KAYU, 2*jumlah_barang);
                this.kurangiBahan(Bahan.BAUT, 10*jumlah_barang);
                this.kurangiBahan(Bahan.CAT, jumlah_barang);
            } else if (tipe_barang == Toko.Type.LEMARI) {
                this.kurangiBahan(Bahan.KAYU, 5*jumlah_barang);
                this.kurangiBahan(Bahan.BAUT, 30*jumlah_barang);
                this.kurangiBahan(Bahan.CAT, 3*jumlah_barang);
            }
            this.masukkanBarangKeGudang(tipe_barang, jumlah_barang);
            System.out.println(jumlah_barang+" "+tipe_barang+" berhasil ditambahkan ke gudang\n");
        }else{
            System.out.println("Bahan tidak mencukupi untuk membuat "+tipe_barang+"\n");
        }
    }
}