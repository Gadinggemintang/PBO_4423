package Calculator;

public class Kalkulator {
    int angkaPertama;
    int angkaKedua;

    public KalKulator(int angkaPertama, int angkaKedua) {
        this.angkaPertama = angkaPertama;
        this.angkaKedua = angkaKedua;
    }
    public int tambah() {
        return this.angkaPertama + this.angkaKedua;
    }
    public int bagi() {
        return this.angkaPertama / this.angkaKedua;
    }
    public int minus() {
        return this.angkaPertama - this.angkaKedua;
    }
    public int kali() {
        return this.angkaPertama * this.angkaKedua;
    }
    public int modulus() {
        return this.angkaPertama % this.angkaKedua;
    }
}