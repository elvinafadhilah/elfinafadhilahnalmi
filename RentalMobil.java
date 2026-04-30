/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package elfina300426;

/**
 *
 * @author lenovo
 */
public class RentalMobil {

    
    private String idSewa;
    private String namaPenyewa;
    private String jenisMobil;
    private int lamaSewa;
    private double hargaSewa;
    private double biayaSewa;
    private double biayaTambahan; 
    private double totalBayar;

    
    public RentalMobil(String idSewa, String namaPenyewa, String jenisMobil, int lamaSewa) {
        this.idSewa = idSewa;
        this.namaPenyewa = namaPenyewa;
        this.jenisMobil = jenisMobil;
        this.lamaSewa = lamaSewa;

        hitungHarga();
        hitungTotal();
    }

    
    private void hitungHarga() {
        if (jenisMobil.equalsIgnoreCase("Avanza")) {
            hargaSewa = 300000;
        } else if (jenisMobil.equalsIgnoreCase("Innova")) {
            hargaSewa = 500000;
        } else if (jenisMobil.equalsIgnoreCase("Fortuner")) {
            hargaSewa = 800000;
        } else {
            hargaSewa = 0;
        }
    }

    
    private void hitungTotal() {
        biayaSewa = hargaSewa * lamaSewa;

        // Diskon
        if (lamaSewa > 5) {
            biayaTambahan = 0.1 * biayaSewa;
        } else {
            biayaTambahan = 0;
        }

        totalBayar = biayaSewa - biayaTambahan;
    }

    
    public void tampilkanData() {
        System.out.println("ID Sewa        : " + idSewa);
        System.out.println("Nama Penyewa   : " + namaPenyewa);
        System.out.println("Jenis Mobil    : " + jenisMobil);
        System.out.println("Lama Sewa      : " + lamaSewa + " hari");
        System.out.println("Harga Sewa     : Rp " + hargaSewa);
        System.out.println("Biaya Sewa     : Rp " + biayaSewa);
        System.out.println("Diskon         : Rp " + biayaTambahan);
        System.out.println("Total Bayar    : Rp " + totalBayar);
    }

    public static void main(String[] args) {
        RentalMobil sewa1 = new RentalMobil("S001", "Elfina", "Innova", 6);
        sewa1.tampilkanData();
    }
}



