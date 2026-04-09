/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elvina020426;

/**
 *
 * @author LAB-SI-PC
 */
   import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

public class nomorterbesar {
    
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int numbers[] = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            numbers[i] = Integer.parseInt(input.readLine());
        }

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Angka terbesar adalah: " + max);
    }
}

