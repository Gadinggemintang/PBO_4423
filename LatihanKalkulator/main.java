package Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        runKalkulator();
    }
    public static void Kalkulator() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan angka pertama : ");
        int angkaPertama = scanner.nextInt();
        System.out.print("Masukan angka kedua : ");
        int angkaKedua = scanner.nextInt();

        Calculator KalKulator = new Kalkulator(angkaPertama, angkaKedua);
        System.out.println(angkaPertama + " + " + angkaKedua + " = " + Kalkulator.tambah());
        System.out.println(angkaPertama + " / " + angkaKedua + " = " + Kalkulator.bagi());
        System.out.println(angkaPertama + " - " + angkaKedua + " = " + Kalkulator.minus());
        System.out.println(angkaPertama + " x " + angkaKedua + " = " + Kalkulator.kali());
        System.out.println(angkaPertama + " % " + angkaKedua + " = " + Kalkulator.modulus());
    }
}