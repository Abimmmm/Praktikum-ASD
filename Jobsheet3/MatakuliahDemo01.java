import java.util.Scanner;
public class MatakuliahDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah01[] arrayMatakuliah01 = new Matakuliah01[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i+1));
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

            arrayMatakuliah01[i] = new Matakuliah01(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakulia ke-" + (i+1));
            System.out.println("Kode       : " + arrayMatakuliah01[i].kode);
            System.out.println("Nama       : " + arrayMatakuliah01[i].nama);
            System.out.println("Sks        : " + arrayMatakuliah01[i].sks);
            System.out.println("Jumlah Jam : " + arrayMatakuliah01[i].jumlahJam);
            System.out.println("----------------------------------");
        }
    }
}
