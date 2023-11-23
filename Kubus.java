import java.util.Scanner;

public class Kubus {

    public static int hitungVolume(int sisi) {
        return sisi*sisi*sisi;
    }

    public static int hitungLuasPermukaan(int sisi) {
        return 6*sisi*sisi;
    }

    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);
        int s,lp,vol;

        System.out.print("Masukkan panjang sisi :");
        s = sc27.nextInt();

        lp = hitungLuasPermukaan(s);
        System.out.println("Luas Persegi adalah :" +lp);

        vol = hitungVolume(s);
        System.out.println("Volume Kubus adalah :" +vol);
        
    }
}
