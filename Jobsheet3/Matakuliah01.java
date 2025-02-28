import java.util.Scanner;
public class Matakuliah01 {
    public String kode;
    public String nama, dummy;
    public int sks;
    public int jumlahJam;
    Scanner sc = new Scanner(System.in);

    public Matakuliah01(){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tambahData(){
        System.out.println("=== Masukkan Data Matakuliah ===");
        System.out.print("Kode       : ");
        kode = sc.nextLine();
        System.out.print("Nama       : ");
        nama = sc.nextLine();
        System.out.print("Sks        : ");
        dummy = sc.nextLine();
        sks = Integer.parseInt(dummy);
        System.out.print("Jumlah Jam : ");
        dummy = sc.nextLine();
        jumlahJam = Integer.parseInt(dummy);
        System.out.println("----------------------------------");
    }
    public void cetakInfo(){
        System.out.println("=== Data Matakuliah ====");
        System.out.println("Kode       : " + kode);
        System.out.println("Nama       : " + nama);
        System.out.println("Sks        : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
        System.out.println("----------------------------------");
    }
}
