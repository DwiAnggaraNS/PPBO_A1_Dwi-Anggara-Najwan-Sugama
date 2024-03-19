import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner Sc = new Scanner(System.in);

        Barang barang1 = new Barang();
        barang1.setNamaBarang("Beras");
        barang1.setHargaBarang(50000);
        barang1.setJumlahBarang(1);


        Barang barang2 = new Barang();
        barang2.setNamaBarang("Sabun");
        barang2.setHargaBarang(10000);
        barang2.setJumlahBarang(2);

        Barang barang3 = new Barang();
        barang3.setNamaBarang("Sampo");
        barang3.setHargaBarang(5000);
        barang3.setJumlahBarang(2);

        Barang barang4 = new Barang();
        barang4.setNamaBarang("Gula");
        barang4.setHargaBarang(15000);
        barang4.setJumlahBarang(3);

        Keranjang keranjang1 = new Keranjang();
        keranjang1.tambahBarang(barang1);
        keranjang1.tambahBarang(barang2);
        keranjang1.tambahBarang(barang3);
        keranjang1.tambahBarang(barang4);

        System.out.println("\n====================\n");

        keranjang1.printHasil();
    }
}