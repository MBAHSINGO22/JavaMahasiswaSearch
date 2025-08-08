package PERTEMUAN11;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Membuat array objek Mahasiswa
        Mahasiswa[] mahasiswaArray = {
            new Mahasiswa("Vania", 232114043),
            new Mahasiswa("Eugenius", 235314099),
            new Mahasiswa("Sisko", 235314100),
            new Mahasiswa("Nicho", 235314098)
        };

        // Mengurutkan array mahasiswa berdasarkan NIM
        Arrays.sort(mahasiswaArray);

        // Mencari mahasiswa dengan NIM tertentu menggunakan pencarian berurutan (sequential search)
        Mahasiswa key1 = new Mahasiswa("Nicho", 235314098); // Mahasiswa dengan NIM yang ada di array
        int result1 = Larik.sequentialSearch(mahasiswaArray, key1);
        // Menampilkan hasil pencarian berurutan
        System.out.println("Sequential Search : " + (result1 != -1 ? "Ditemukan di indeks " + result1 : "Tidak Ditemukan"));

        // Mencari mahasiswa dengan NIM tertentu menggunakan pencarian biner (binary search)
        Mahasiswa key2 = new Mahasiswa("Eugenius", 235314099); // Mahasiswa dengan NIM yang ada di array
        int result2 = Larik.binarySearch(mahasiswaArray, key2);
        // Menampilkan hasil pencarian biner
        System.out.println("Binary Search : " + (result2 != -1 ? "Ditemukan di indeks " + result2 : "Tidak Ditemukan"));

        // Mencari mahasiswa dengan NIM tertentu menggunakan pencarian interpolasi (interpolation search)
        Mahasiswa key3 = new Mahasiswa("Sisko", 235314100); // Mahasiswa dengan NIM yang ada di array
        int result3 = Larik.interpolationSearch(mahasiswaArray, key3);
        // Menampilkan hasil pencarian interpolasi
        System.out.println("Interpolation Search : " + (result3 != -1 ? "Ditemukan di indeks " + result3 : "Tidak Ditemukan"));
    }
}