public class KelinciKecil {

    /**
     * Fungsi untuk menghitung jumlah lompatan minimal yang diperlukan untuk mencapai target
     * @param posisiA
     * @param posisiB
     * @param lompatanC
     * @return jumlah_lompatan
     */
    static int hitung_jumlah_lompatan(int posisiA, int posisiB, int lompatanC) {
        
        // Initial jumlah lompatan
        int jumlah_lompatan = 0;
        
        // Mengecek apakah titik awal posisi A kurang dari atau sama dengan titik posisi B
        while (posisiA <= posisiB) {

            // Jika True, maka:
            posisiA += lompatanC; // 1. Titik awal posisi A akan ditambahkan dengan lompatan C
            jumlah_lompatan += 1; // 2. Yang berarti bahwa si kelinci kecil sudah melompat sekali (ditambahkan satu lompatan)

        }

        return jumlah_lompatan;
    }

    public static void main (String[] args) {
        
        int posisiA = 10;
        int posisiB = 85;
        int lompatanC = 30;

        int jumlah_lompatan_minimal = hitung_jumlah_lompatan(posisiA, posisiB, lompatanC);
        System.out.println("Jumlah lompatan minimal yang dibutuhkan kelinci kecil adalah " + jumlah_lompatan_minimal);
    
    }

}