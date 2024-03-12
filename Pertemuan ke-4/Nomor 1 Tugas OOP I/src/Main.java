//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Barang barang1 = new Barang("sabun", 50000, 1);
        Barang barang2 = new Barang("sampo", 10000, 2);
        Barang barang3 = new Barang("pasta gigi", 5000, 20);
        Barang barang4 = new Barang("sikat gigi", 2000, 10);


        Keranjang keranjang = new Keranjang();
        keranjang.tambahBarang(barang1);
        keranjang.tambahBarang(barang2);
        keranjang.tambahBarang(barang3);
        keranjang.tambahBarang(barang4);

        System.out.println("\n===================\n");

        keranjang.printHasil();
    }
}