import java.util.Scanner;
public class tugas2 {
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double sisi;
        while (true) {
            System.out.println("=== Kubus ===");
            System.out.println("1. Hitung Volume");
            System.out.println("2. Hitung Luas Permukaan");
            System.out.println("3. Hitung Keliling");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu (1-4) : ");
            int pilih = sc.nextInt();
            if (pilih == 4) {
                System.out.println("Terima kasih! Program selesai.");
                break;
            }else{
                System.out.print("Masukkan panjang sisi kubus: ");
                sisi = sc.nextDouble();
                switch (pilih) {
                    case 1:
                        System.out.println("Volume Kubus: " + hitungVolume(sisi));
                        break;
                    case 2:
                        System.out.println("Luas Permukaan Kubus: " + hitungLuasPermukaan(sisi));
                        break;
                    case 3:
                        System.out.println("Keliling Kubus: " + hitungKeliling(sisi));
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            }
        }
    }
    static double hitungVolume(double sisi) {
        return sisi * sisi * sisi;
    }
    static double hitungLuasPermukaan(double sisi) {
        return 6 * sisi * sisi;
    }
    static double hitungKeliling(double sisi) {
        return 12 * sisi;
    }

}
