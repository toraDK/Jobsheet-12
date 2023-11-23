import java.util.Scanner;

public class NilaiMahasiswa {
    static String[] namaMhs;
    static int[][] nilaiTugas = new int[5][7]; //array 2 dimensinya

    public static void inputNilai() {
        Scanner input01 = new Scanner(System.in);

        for (int i = 0; i < namaMhs.length; i ++){
            System.out.print("Masukkan Nama mahasiswa :");
            namaMhs[i] = input01.next();
            System.out.println("Masukkan Nilai Tugas Mahasiswa " + namaMhs[i] + ": ");
            for (int j = 0; j < nilaiTugas[i].length; j++){
                System.out.print("Masukkan Nilai ke" + j + ": ");
                nilaiTugas[i][j] = input01.nextInt();
            }
        }
        System.out.println();
    }


    public static void PrintNilaiMHS(){
        System.out.println("\nSeluruh Nilai Mahasiswa :");
        System.out.printf("| %-10s | %-15s | %-15s | %-15s | %-15s | %-15s | %-15s | %-15s |\n", "NAMA", "MINGGU 1", "MINGGU 2", "MINGGU 3", "MINGGU 4", "MINGGU 5", "MINGGU 6", "MINGGU 7");

        for (int i = 0; i < namaMhs.length; i++) {
            System.out.printf("| %-10s", namaMhs[i]);
    
            for (int j = 0; j < nilaiTugas[i].length; j++) {
                System.out.printf(" | %-15s", nilaiTugas[i][j]);
            }
    
            System.out.println(" |");
        }
    
        System.out.println();
    }

    //untuk mencari pada hari keberapa ada nilai tertinggi
    public static int CariNilaiTetringgi(){
        int mingguTertinggi =  0;
        int nilaiTertinggi = 0;

        for (int j = 0; j < nilaiTugas[0].length; j++){
            int totalNilaiPerminggu = 0;
            for (int i = 0; i < namaMhs.length; i++){
                totalNilaiPerminggu += nilaiTugas[i][j];
            }
            if (totalNilaiPerminggu > nilaiTertinggi) {
                nilaiTertinggi = totalNilaiPerminggu;
                mingguTertinggi = j + 1;
            }
        }
        return mingguTertinggi;
    }


    public static void NilaiTertinggiMHS (int minggu){
        int nilaiTertinggi = 0;
        String NilaiTertinggiMHS = "";

        for (int i = 0; i < namaMhs.length; i++){
            if (nilaiTugas[i][minggu - 1] > nilaiTertinggi){
                nilaiTertinggi = nilaiTugas[i][minggu -  1];
                NilaiTertinggiMHS = namaMhs[i];
            }
        }

        System.out.println("Mahasiswa dengan nilai tertinggi adalah " + NilaiTertinggiMHS + " dengan nilai " + nilaiTertinggi + ", pada minggu ke-" + minggu + ".");
    }
    public static void main(String[] args) {
        inputNilai();
        PrintNilaiMHS();
        int mingguTertinggi =  CariNilaiTetringgi();
        System.out.println("Pada minggu ke-" + mingguTertinggi + " terdapat nilai mahasiswa yang lebih tinggi dibandingkan nilai mahasiswa di minggu lain.");
        NilaiTertinggiMHS(mingguTertinggi);
    }
}
