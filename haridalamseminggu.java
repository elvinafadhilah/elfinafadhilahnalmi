/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package elvina020426;

/**
 *
 * @author LAB-SI-PC
 */
public class haridalamseminggu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int i = 0;
        System.out.println("Menggunakan while-loop:");
        while (i < days.length) {
            System.out.println(days[i]);
            i++;
        }

        int j = 0;
        System.out.println("\nMenggunakan do-while:");
        do {
            System.out.println(days[j]);
            j++;
        } while (j < days.length);
             
        System.out.println("\nMenggunakan for-loop:");
        for (int k = 0; k < days.length; k++) {
            System.out.println(days[k]);
        }
    }
}
