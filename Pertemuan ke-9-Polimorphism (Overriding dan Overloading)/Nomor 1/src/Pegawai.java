import java.text.DecimalFormat;

public class Pegawai {
    DecimalFormat df = new DecimalFormat("0000");

    public enum Gender{Pria, Wanita}
    public enum JenisCuti {Persalinan, Pernikahan}

    private String nama;
    private String departemen;
    private Gender gender;
    private int cuti = 12;
    private int gaji;
    protected String NIP;

    public String getNama() {return nama;}
    public void setNama(String nama) {this.nama = nama;}

    public Gender getGender() {return gender;}
    public void setGender(Gender gender) {this.gender = gender;}

    public String getDepartemen() {return departemen;}
    public void setDepartemen(String departemen) {this.departemen = departemen;}

    public int getGaji() {return gaji;}
    public void setGaji(int gaji) {this.gaji = gaji;}

    public String getNIP() {return NIP;}

    public int getCuti() {return cuti;}

    public Pegawai(String nama,String departemen, Gender gender) {
        this.nama = nama;
        this.departemen = departemen;
        this.gender = gender;
    }

    public void setCuti(JenisCuti jenisCuti){
        if (jenisCuti == JenisCuti.Persalinan){
            int jumlahCuti = (this.gender == Gender.Pria) ? 3:90;
            this.cuti+=jumlahCuti;
        } else if (jenisCuti == JenisCuti.Pernikahan) {
            this.cuti+=2;
        }
    }

    public void setCuti(int jumlahCuti){this.cuti+=jumlahCuti;}

    public int infoTHR(){return this.gaji;}

    public void setNIP(String nip){
        if (nip.charAt(0) == 'P'){
            this.NIP = nip;
        }else{
            System.out.println("NIP tidak sesuai peraturan");
        }
    }

    public void setNIP(int urutanMasuk){this.NIP = "P"+df.format(urutanMasuk);}

    public void displayInfo(){
        if (this.getClass().getName() != "Manager"){
            System.out.println("Jabatan : Pegawai");

        }else{
            System.out.println("Jabatan : "+this.getClass().getName());
        }
        System.out.println("Nama : "+this.nama);
        System.out.println("Departemen : "+this.departemen);
        System.out.println("NIP : "+this.NIP);
        System.out.println("Gaji : "+this.gaji);
        System.out.println("THR : "+this.infoTHR());
        System.out.println("Cuti : "+this.cuti);
        System.out.println("===========================================");
    }
}