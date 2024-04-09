public class Main {
    public static void main(String[] args) {
        Toko mebel1 = new Toko();
        System.out.println("TEST CASE 1: ");
        mebel1.getGudangBarang().tambahBahan(Gudang.Bahan.KAYU, 20);
        mebel1.getGudangBarang().tambahBahan(Gudang.Bahan.BAUT, 100);
        mebel1.getGudangBarang().tambahBahan(Gudang.Bahan.CAT, 15);
        mebel1.getGudangBarang().cekStokBahan();

        System.out.println("TEST CASE 2: ");
        mebel1.getGudangBarang().kurangiBahan(Gudang.Bahan.BAUT, 5);
        mebel1.getGudangBarang().cekStokBahan();

        System.out.println("TEST CASE 3: ");
        mebel1.getGudangBarang().buatBarang(Toko.Type.KURSI,3);
        mebel1.getGudangBarang().cekStokBahan();

        System.out.println("TEST CASE 4: ");
        mebel1.getGudangBarang().buatBarang(Toko.Type.KURSI, 5);
        mebel1.getGudangBarang().buatBarang(Toko.Type.MEJA, 5);
        mebel1.getGudangBarang().cekStokBahan();
        mebel1.getGudangBarang().cekIsiGudang();

        System.out.println("TEST CASE 5: ");
        mebel1.getGudangBarang().tambahBahan(Gudang.Bahan.KAYU, 20);
        mebel1.getGudangBarang().tambahBahan(Gudang.Bahan.BAUT, 100);
        mebel1.getGudangBarang().tambahBahan(Gudang.Bahan.CAT, 15);
        mebel1.getGudangBarang().cekStokBahan();

        System.out.println("TEST CASE 6: ");
        mebel1.getGudangBarang().buatBarang(Toko.Type.KURSI, 5);
        mebel1.getGudangBarang().cekStokBahan();
        mebel1.getGudangBarang().cekIsiGudang();

        Pembeli pembeli1 = new Pembeli("hanif", Toko.Type.KURSI, 10);
        Pembeli pembeli2 = new Pembeli("justin", Toko.Type.KURSI, 2);
        Pembeli pembeli3 = new Pembeli("sandra", Toko.Type.MEJA, 2);
        Pembeli pembeli4 = new Pembeli("dewi", Toko.Type.KURSI, 100);
        Pembeli pembeli5 = new Pembeli("lhaksana", Toko.Type.LEMARI, 2);

        System.out.println("TEST CASE 7: ");
        mebel1.tambahAntrian(pembeli1);
        mebel1.tambahAntrian(pembeli2);
        mebel1.tambahAntrian(pembeli3);
        mebel1.cekIsiAntrian();

        System.out.println("TEST CASE 8: ");
        mebel1.selesaikanAntrian();
        mebel1.cekIsiAntrian();
        mebel1.selesaikanAntrian();
        mebel1.cekIsiAntrian();
        mebel1.getGudangBarang().cekIsiGudang();
        mebel1.selesaikanAntrian();

        System.out.println("TEST CASE 9: ");
        mebel1.tambahAntrian(pembeli4);
        mebel1.tambahAntrian(pembeli3);
        mebel1.tambahAntrian(pembeli5);
        mebel1.tambahAntrian(pembeli2);
        mebel1.cekIsiAntrian();
        mebel1.tambahAntrian(pembeli5);
        mebel1.tambahAntrian(pembeli5);
        mebel1.tambahAntrian(pembeli5);
    }
}