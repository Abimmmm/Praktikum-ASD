import java.util.Scanner;
public class DosenDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jml;
        System.out.print("Masukkan Jumlah Dosen : ");
        jml = sc.nextInt();
        Dosen01[] arrayDosen = new Dosen01[jml];
        String kode, nama, dummy;
        Boolean jenisKelamin;
        int usia;

        for (int i = 0; i < jml; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i+1));

            arrayDosen[i] = new Dosen01();
            arrayDosen[i].tambahData();
        }

        int i = 0;
        for (Dosen01 dosen01 : arrayDosen) {
            System.out.println("Data Dosen ke-" + (i+1));
            dosen01.dataSemuaDosen();
            i++;
        }

        System.out.println("=== Jumlah Dosen PerJenis Kelamin ===");
        Dosen01.jumlahDosenPerJenisKelamin(arrayDosen);
        System.out.println("------------------------------" );

        System.out.println("=== Rarat-rata Usia Dosen ===");
        Dosen01.rerataUsiaDosenPerJenisKelamin(arrayDosen);
        System.out.println("------------------------------" );

        System.out.println("=== Dosen Paling Tua ===");
        Dosen01.infoDosenPalingTua(arrayDosen);
        System.out.println("------------------------------" );

        System.out.println("=== Dosen Paling Muda ===");
        Dosen01.infoDosenPalingMuda(arrayDosen);
        System.out.println("------------------------------" );
    }
}
