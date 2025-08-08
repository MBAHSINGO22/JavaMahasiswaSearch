package PERTEMUAN11;

public class Mahasiswa implements Comparable<Mahasiswa> {
    // Deklarasi atribut private untuk nama dan NIM mahasiswa
    private String nama;
    private int nim;

    // Konstruktor untuk menginisialisasi objek Mahasiswa dengan nama dan NIM
    public Mahasiswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // Getter untuk mendapatkan nilai nama mahasiswa
    public String getNama() {
        return nama;
    }

    // Getter untuk mendapatkan nilai NIM mahasiswa
    public int getNim() {
        return nim;
    }

    // Implementasi metode compareTo dari interface MyComparable
    // Membandingkan objek Mahasiswa berdasarkan NIM
    @Override
    public int compareTo(Mahasiswa m) {
        return Integer.compare(this.nim, m.getNim());
    }

    // Override metode toString untuk mengembalikan representasi string dari objek Mahasiswa
    @Override
    public String toString() {
        return "Mahasiswa{nama='" + nama + "', nim=" + nim + '}';
    }
}
