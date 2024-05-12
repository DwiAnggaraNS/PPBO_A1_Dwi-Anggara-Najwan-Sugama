public class Main {
    public static void main(String[] args) {
        Pegawai pegawai1= new Pegawai ( "Diza", "HRD",  Pegawai.Gender.Wanita);
        pegawai1.setGaji (1000000);
        pegawai1.setCuti(10);
        pegawai1.setNIP("P0001");
        pegawai1.displayInfo();

        Pegawai pegawai2 = new Pegawai ("Raihan", "Product",  Pegawai.Gender.Pria);
        pegawai2.setGaji (1500000);
        pegawai2.setCuti (Pegawai.JenisCuti.Pernikahan);
        pegawai2.setNIP(2);
        pegawai2.displayInfo();

        Manager manager = new Manager ("Nayla", "Operational", Pegawai.Gender.Wanita);
        manager.setGaji(2000000);
        manager.setCuti (Pegawai.JenisCuti.Persalinan);
        manager.setNIP(3);
        manager.displayInfo();

        Salesman salesman1 = new Salesman ("Fauzan", "Marketing", Pegawai.Gender.Pria);
        salesman1.setGaji (2500000);
        salesman1.setTarget (100);
        salesman1.setPenjualan (120);
        salesman1.setCuti (Pegawai.JenisCuti.Persalinan);
        salesman1.setNIP("S0004");
        salesman1.displayInfo();
    }
}