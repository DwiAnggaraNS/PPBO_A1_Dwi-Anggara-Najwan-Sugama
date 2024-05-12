public class Salesman extends Pegawai{


    private int target;
    private int penjualan;

    public Salesman(String nama, String departemen, Gender gender) {
        super(nama, departemen, gender);
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public int getPenjualan() {
        return penjualan;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    @Override
    public int infoTHR() {
        if (this.penjualan >= this.target){
            return super.getGaji()*2;
        }else{
            return super.getGaji();
        }
    }

    @Override
    public void setNIP(String nip) {
        if (nip.charAt(0) == 'S'){
            super.NIP = nip;
        }else {
            System.out.println("NIP tidak sesuai peraturan!");
        }
    }

    @Override
    public void setNIP(int urutanMasuk) {
        super.NIP = "S"+df.format(urutanMasuk);
    }
}