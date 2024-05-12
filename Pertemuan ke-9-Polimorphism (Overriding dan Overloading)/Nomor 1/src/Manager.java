public class Manager extends Pegawai{


    public Manager(String nama, String departemen, Gender gender) {
        super(nama, departemen, gender);
    }

    @Override
    public int infoTHR() {
        return super.getGaji()*2;
    }

    @Override
    public void setNIP(String nip) {
        if (nip.charAt(0) == 'M'){
            super.NIP = nip;
        }else {
            System.out.println("NIP tidak sesuai peraturan!");
        }
    }

    @Override
    public void setNIP(int urutanMasuk) {
        super.NIP = "M"+df.format(urutanMasuk);
    }
}