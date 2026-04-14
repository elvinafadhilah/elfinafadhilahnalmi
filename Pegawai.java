package latihan;

/**
 * @author lenovo
 */
public class Pegawai {
    
    private String nip;
    private String nama;
    private String golongan;
    private double gajiPokok;
    private double tunjangan;
    private double potongan;
    private double gajiBersih;
    
    public Pegawai(String nip, String nama, String golongan, double potongan) {
        this.nip = nip;
        this.nama = nama;
        this.golongan = golongan;
        this.potongan = potongan;
        hitungGaji(); 
    }
   
    private void hitungGaji() {
        switch (golongan.toUpperCase()) {
            case "IA":
                this.gajiPokok = 2000000;
                break;
            case "IB":
                this.gajiPokok = 3000000;
                break;
            case "IC":
                this.gajiPokok = 4000000;
                break;
            default:
                this.gajiPokok = 0;
                break;
        }

        this.tunjangan = 0.10 * this.gajiPokok;
        this.gajiBersih = (this.gajiPokok + this.tunjangan) - this.potongan;
    }

    public void tampilkanData() {
        System.out.println("--- Data Pegawai ---");
        System.out.println("NIP          : " + nip);
        System.out.println("Nama         : " + nama);
        System.out.println("Golongan     : " + golongan);
        System.out.println("Gaji Pokok   : Rp " + gajiPokok);
        System.out.println("Tunjangan    : Rp " + tunjangan);
        System.out.println("Potongan     : Rp " + potongan);
        System.out.println("Gaji Bersih  : Rp " + gajiBersih);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        
        Pegawai p1 = new Pegawai("202401", "Budi Santoso", "IB", 50000);
        
        p1.tampilkanData();
    }
}