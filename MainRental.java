/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elfina300426;

/**
 *
 * @author lenovo
 */
import java.util.Scanner;
public class MainRental {
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RentalMobil rm = new RentalMobil();

        System.out.println("=== DATA RENTAL MOBIL ===");

        System.out.print("ID Sewa        : ");
        rm.idSewa = input.nextLine();

        System.out.print("Nama Penyewa   : ");
        rm.namaPenyewa = input.nextLine();

        System.out.print("Jenis Mobil (Avanza/Innova/Fortuner): ");
        rm.jenisMobil = input.nextLine();

        System.out.print("Lama Sewa (hari): ");
        rm.lamaSewa = input.nextInt();

        // Proses
        rm.setHargaSewa();
        rm.hitungTotal();

        System.out.println("\n=== HASIL ===");
        rm.tampilData();
    }
}
