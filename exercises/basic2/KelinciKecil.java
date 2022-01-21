public class KelinciKecil {

    /**
     * Fungsi untuk menghitung jumlah lompatan minimal yang diperlukan untuk mencapai target
     * @param posisiA
     * @param posisiB
     * @param lompatanTetapC
     * @return jumlah_lompatan
     */
    static int hitungJumlahLompatan(int posisiA, int posisiB, int lompatanTetapC) {
        
        // Initial jumlah lompatan
        int jumlahLompatan = 0;
        
        // Mengecek apakah titik awal posisi A kurang dari atau sama dengan titik posisi B
        while (posisiA <= posisiB) {

            // Jika True, maka:
            posisiA += lompatanTetapC; // 1. Titik awal posisi A akan ditambahkan dengan lompatan C
            jumlahLompatan += 1; // 2. Yang berarti bahwa si kelinci kecil sudah melompat sekali (ditambahkan satu lompatan)

        }

        return jumlahLompatan;
    }

    public static void main (String[] args) {
        
        int posisiA = 10;
        int posisiB = 85;
        int lompatanTetapC = 30;

        int jumlahLompatanMinimal = hitungJumlahLompatan(posisiA, posisiB, lompatanTetapC);
        System.out.println("Jumlah lompatan minimal yang dibutuhkan kelinci kecil adalah " + jumlahLompatanMinimal);
    
    }

}