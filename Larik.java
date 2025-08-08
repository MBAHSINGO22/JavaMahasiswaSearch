package PERTEMUAN11;

public class Larik {

    // Metode untuk melakukan pencarian berurutan (sequential search) pada array Mahasiswa
    // Mengembalikan indeks dari key jika ditemukan, jika tidak mengembalikan -1
    public static int sequentialSearch(Mahasiswa[] array, Mahasiswa key) {
        // Melakukan iterasi melalui array
        for (int i = 0; i < array.length; i++) {
            // Memeriksa apakah elemen array pada indeks i sama dengan key
            if (array[i].compareTo(key) == 0) {
                // Mengembalikan indeks jika ditemukan
                return i;
            }
        }
        // Mengembalikan -1 jika tidak ditemukan
        return -1;
    }

    // Metode untuk melakukan pencarian biner (binary search) pada array Mahasiswa yang sudah terurut
    // Mengembalikan indeks dari key jika ditemukan, jika tidak mengembalikan -1
    public static int binarySearch(Mahasiswa[] array, Mahasiswa key) {
        int left = 0;
        int right = array.length - 1;

        // Melakukan iterasi selama left kurang dari atau sama dengan right
        while (left <= right) {
            // Menghitung nilai tengah (mid)
            int mid = (left + right) / 2;
            // Memeriksa apakah elemen tengah lebih kecil dari key
            if (array[mid].compareTo(key) < 0) {
                left = mid + 1;
            // Memeriksa apakah elemen tengah lebih besar dari key
            } else if (array[mid].compareTo(key) > 0) {
                right = mid - 1;
            // Jika elemen tengah sama dengan key
            } else {
                return mid;
            }
        }
        // Mengembalikan -1 jika tidak ditemukan
        return -1;
    }

    // Metode untuk melakukan pencarian interpolasi (interpolation search) pada array Mahasiswa yang sudah terurut
    // Mengembalikan indeks dari key jika ditemukan, jika tidak mengembalikan -1
    public static int interpolationSearch(Mahasiswa[] array, Mahasiswa key) {
        int low = 0;
        int high = array.length - 1;

        // Melakukan iterasi selama low kurang dari atau sama dengan high dan key berada dalam rentang nilai array
        while (low <= high && key.getNim() >= array[low].getNim() && key.getNim() <= array[high].getNim()) {
            // Memeriksa apakah low sama dengan high
            if (low == high) {
                if (array[low].compareTo(key) == 0) return low;
                return -1;
            }

            // Menghitung posisi yang diprediksi menggunakan interpolasi
            int pos = low + ((key.getNim() - array[low].getNim()) * (high - low) / 
                    (array[high].getNim() - array[low].getNim()));

            // Memeriksa apakah elemen pada posisi diprediksi sama dengan key
            if (array[pos].compareTo(key) == 0) {
                return pos;
            }

            // Memeriksa apakah elemen pada posisi diprediksi lebih kecil dari key
            if (array[pos].getNim() < key.getNim()) {
                low = pos + 1;
            // Jika elemen pada posisi diprediksi lebih besar dari key
            } else {
                high = pos - 1;
            }
        }
        // Mengembalikan -1 jika tidak ditemukan
        return -1;
    }
}
