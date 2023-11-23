import java.util.Scanner;

public class UcapanTerimaKasih_27 {
    
    public static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Tuliskan NAMA orang yang ingin Anda beri ucapan:");
        String namaOrang = sc.nextLine();
        return namaOrang;
        
    }

    public static void UcapanTerimaKasih(){
        String nama = PenerimaUcapan();
        String kata2 = UcapanTambahan();
        System.out.println(kata2 + "\n" + "Thank you "+nama+" for being the best teacher in the world.\n" 
        + "You inspired in me a love for learning and made me feel like I could ask you anything.");
        
    }

    public static String UcapanTambahan(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Ucapan Tambahan :");
        String kata2 = input.nextLine();

        return kata2;
    }

    public static void main(String[] args) {
        UcapanTerimaKasih();
    }
}
